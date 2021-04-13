package com.example.demo.repos;

import com.example.demo.models.Friend;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Iryna Gnatenko
 * Date 2021-04-13
 * Time 7:52 PM
 * Project SpringInitializrFriend
 */
public class Dao {

    public List<Friend> getAllFriends() {

        List<Friend> listOfFriends = new LinkedList<>();

        Friend f1 = new Friend(1,"Anna", "Hornsgsgatan 91", "0705678965");
        Friend f2 = new Friend(2,"Sebastian", "Rådmansgatan 162", "0723654789");
        Friend f3 = new Friend(3,"Lisa", "Blekingegatan 13", "0701236547");
        Friend f4 = new Friend(4,"Katarina", "Valhallavägen 72", "0733698521");
        Friend f5 = new Friend(5,"Olof", "Odengatan 16", "0701111111");
        Friend f6 = new Friend(6,"Johan", "Sibyllagatan 27", "0724563987");


        listOfFriends.add(f1);
        listOfFriends.add(f2);
        listOfFriends.add(f3);
        listOfFriends.add(f4);
        listOfFriends.add(f5);
        listOfFriends.add(f6);

        return listOfFriends;
    }

}
