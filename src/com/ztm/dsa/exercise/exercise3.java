package com.ztm.dsa.exercise;

import java.util.*;

public class exercise3 {
    public static void twitter(String[] tweets){
        String firstTweet = tweets[0];
        System.out.println(firstTweet);
        String lastTweet = tweets[tweets.length-1];
        System.out.println(lastTweet);
    }
    public static void tweetsByTime(List<Map<String, Object>> tweetsByTime){

    }

    public static void main(String[] args) {
        String[] tweetArray = {"Hi Twitter"," How is it going", "Bye twitter"};
        twitter(tweetArray);
    }
}
