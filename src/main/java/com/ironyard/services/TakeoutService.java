package com.ironyard.services;

import com.ironyard.data.Takeout;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sam on 9/22/16.
 */
public class TakeoutService {

    public List<Takeout> generateFaveTakeoutSpots(){
        List<Takeout> mylist = new ArrayList<>();
        mylist.add(new Takeout("Thai House", "Thai", "5 miles", 1));
        mylist.add(new Takeout("Chipotle", "Mexican", "2.8 miles", 2));
        return mylist;
    }

}
