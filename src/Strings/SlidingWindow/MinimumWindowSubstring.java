package Strings.SlidingWindow;

import java.util.HashMap;

public class MinimumWindowSubstring {
//    public String minimumWindowSubstring(String s, String t){
//        int minLength = Integer.MAX_VALUE;
//        int startIndex = -1;
//
//        for (int i = 0; i < s.length(); i++) {
//            for (int j = i; j < s.length(); j++) {
//                int length = j - i + 1;
//                if(containsAllChars(s, t, i, j)){
//                    if(length < minLength){
//                        minLength = length;
//                        startIndex = i;
//                    }
//                }
//            }
//        }
//
//        if(startIndex == -1)  return "";
//        StringBuilder result = new StringBuilder();
//        for(int i = startIndex; i < startIndex + minLength; i++){
//            result = result.append(s.charAt(i));
//        }
//        return result.toString();
//    }
//
//    private boolean containsAllChars(String s, String t, int start, int end){
//        int[] tFreq = new int[128];
//        int[] sFreq = new int[128];
//
//        for (int k = 0; k < t.length(); k++){
//            tFreq[t.charAt(k)]++;
//        }
//
//        for (int k = start; k <= end; k++){
//            sFreq[s.charAt(k)]++;
//        }
//
//        for(int i = 0; i < 128; i++){
//            if(sFreq[i] < tFreq[i]){
//                return false;
//            }
//        }
//
//        return true;
//    }
//
//    public static void main(String[] agrs){
//        String s = "ADOBECODEBANC";
//        String t = "ABC";
//        MinimumWindowSubstring obj = new MinimumWindowSubstring();
//        String subString = obj.minimumWindowSubstring(s,t);
//        System.out.println(subString);
//    }

    public String minimumWindowSubstring(String s, String t) {
        if (s == null || t == null || s.length() < t.length()) return "";

        HashMap<Character, Integer> tFreq = new HashMap<>();

        for (char c : t.toCharArray()) {
            tFreq.put(c, tFreq.getOrDefault(c, 0) + 1);
        }

        int have = 0;
        int need = tFreq.size();
        int minLen = Integer.MAX_VALUE;
        int left = 0;
        int startIndex = 0;

        HashMap<Character, Integer> sFreq = new HashMap<>();
        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            sFreq.put(c, sFreq.getOrDefault(c, 0) + 1);


            if (tFreq.containsKey(c) && tFreq.get(c).intValue() == sFreq.get(c).intValue()) {
                have++;
            }

            while (have == need) {
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    startIndex = left;
                }

                char leftChar = s.charAt(left);
                sFreq.put(leftChar, sFreq.get(leftChar) - 1);
                if (tFreq.containsKey(leftChar) && sFreq.get(leftChar).intValue() < tFreq.get(leftChar).intValue()) {
                    have--;
                }
                left++;
            }
        }
            return minLen == Integer.MAX_VALUE ? "" : s.substring(startIndex, startIndex + minLen);
        }


    public static void main(String[] args){
        String s = "ADOBECODEBANC";
        String t = "ABC";

        MinimumWindowSubstring obj = new MinimumWindowSubstring();
        String result = obj.minimumWindowSubstring(s, t);
        System.out.println("Minimum Window Substring: " + result);
    }
}
