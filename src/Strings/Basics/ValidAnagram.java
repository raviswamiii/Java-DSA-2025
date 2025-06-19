package Strings.Basics;

import java.util.Arrays;

public class ValidAnagram {
//    public static boolean isAnagram(String s, String t){
//        if(s.length() != t.length()) return false;
//
//        char[] sArr = s.toCharArray();
//        char[] tArr = t.toCharArray();
//
//        Arrays.sort(sArr);
//        Arrays.sort(tArr);
//
//        return Arrays.equals(sArr, tArr);
//    }
//
//    public static void main(String[] args){
//        String s = "anagram";
//        String t = "nagaram";
//        boolean Anagram = isAnagram(s, t);
//        System.out.println(Anagram);
//    }


    public static boolean isAnagram(String s, String t){
        if(s.length() != t.length()) return false;

        int[] count = new int[26];

        for(int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for(int c : count){
            if(c != 0){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args){
        String s = "anagram";
        String t = "nagaram";
        boolean Anagram = isAnagram(s, t);
        System.out.println(Anagram);
    }
}
