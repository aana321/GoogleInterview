package org.example;

public class IsoMorphicString {

    private static final int CHAR = 26;


    public static boolean isIsomorphic(String s, String t){
        int n = s.length();
        int m = t.length();

        int[] charCountS = new int[CHAR];
        int[] charCountT = new int[CHAR];

        for(int i = 0; i < s.length(); i++){
            charCountS[s.charAt(i) - 'a']++;
            charCountT[t.charAt(i) - 'a']++;
        }

        for(int i = 0; i < n; i++){
            if(charCountS[s.charAt(i) - 'a'] != charCountT[t.charAt(i) - 'a']){
                return false;
            }
        }

        return true;

    }

    public static void main(String[] args){

        String s = "abc";
        String t = "xxxyz";
        System.out.println(isIsomorphic(s,t));
    }
}
