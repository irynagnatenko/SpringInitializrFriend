package com.example.demo.controllers;

import com.example.demo.models.Friend;
import com.example.demo.models.Response;
import com.example.demo.repos.Dao;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Iryna Gnatenko
 * Date 2021-04-13
 * Time 7:51 PM
 * Project SpringInitializrFriend
 */

@RestController
public class FriendController {

    Dao DB = new Dao();
    List<Friend> myfriends = DB.getAllFriends();

    @RequestMapping("/friends")
    public List<Friend> getMyfriends() {
        return myfriends;
    }

    @RequestMapping("/friend/{id}")
    public Friend getFriendById(@PathVariable int id) {

        Friend chooseFriend = new Friend();

        for (Friend f: myfriends) {
            if (f.getId() == id) {
                chooseFriend = f;
            }
        }
        return chooseFriend;
    }

    @RequestMapping("friend/{id}/delete")
    public Response deleteFriendById (@PathVariable("id") int id) {
        Response res = new Response("Friend deleted", Boolean.FALSE);

        int indexToRemove = -1;
        for (int i = 0; i < myfriends.size(); i++) {
            if (myfriends.get(i).getId() == id) {
                indexToRemove = i;
            }
        }
        if (indexToRemove != -1) {
            myfriends.remove(indexToRemove);
            res.setStatus(Boolean.TRUE);
        }
        return res;
    }

    /*
      @RequestMapping("/friend/{id}/delete")
        public List<Friend> deleteFriend(@PathVariable int id){
        myfriends.removeIf(e -> e.getId()==id);
        return myfriends;
    }
     */

    @PostMapping("/friend/add")
    public Response addFriend(@RequestBody Friend friend){
        System.out.println(friend.getId() + " " + friend.getName());

        Response res = new Response("Friend added", Boolean.FALSE);
        myfriends.add(friend);
        res.setStatus(Boolean.TRUE);
        return res;
    }
    /*
     @PostMapping("/friend/add")
     public String addFriend(@RequestBody Friend friend){
        myfriends.add(friend);
        return friend.getName() + " is now added";
    }
     */

    @PostMapping ("/friend/upsert")
    public Response upsertFriend(@RequestBody Friend friend){
        Response res = new Response("Friend info is updated", Boolean.FALSE);

        int indexToUpdate = -1;
        for (int i = 0; i < myfriends.size(); i++){
            if (myfriends.get(i).getId() == friend.getId()){
                indexToUpdate = i;
            }
        }

        if (indexToUpdate == -1){
            myfriends.add(friend);
            res.setMessage("Friend was added");
            res.setStatus(Boolean.TRUE);
        }
        else{
            myfriends.set(indexToUpdate, friend);
            res.setStatus(Boolean.TRUE);
        }
        return res;
    }
}
