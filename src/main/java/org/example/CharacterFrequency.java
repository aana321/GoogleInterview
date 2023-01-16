package org.example;

import java.util.HashMap;
import java.util.Map;

public class CharacterFrequency {

    public static void printCharFreq(String s){

        Map<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < s.length(); i++){

            if(map.containsKey(s.charAt(i))){

                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            }else{

                map.put(s.charAt(i), 1);
            }

        }

        for(int i = 0; i < s.length(); i++){}
    }
}
