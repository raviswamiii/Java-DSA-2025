package Strings.TwoPointers;

public class LongestPalindromicSubstring {
//    public String longestPalindrome(String s){
//        if(s == null || s.length() < 1) return "";
//
//        int maxLength = 0;
//        String result = "";
//
//        for(int i = 0; i < s.length(); i++){
//            for (int j = i; j < s.length(); j++) {
//                String sub = s.substring(i, j+1);
//                if(isPalindrome(sub) && sub.length() > maxLength){
//                    result = sub;
//                    maxLength = sub.length();
//                }
//            }
//        } return result;
//    }
//
//    private boolean isPalindrome(String str){
//        int left = 0;
//        int right = str.length() - 1;
//
//        while(left < right){
//            if(str.charAt(left++) != str.charAt(right--)){
//                return false;
//            }
//        } return true;
//    }
//
//    public static void main(String[] args){
//        String s = "babad";
//        LongestPalindromicSubstring obj = new LongestPalindromicSubstring();
//        String longestPalindrome = obj.longestPalindrome(s);
//        System.out.println(longestPalindrome);
//
//    }


    public String longestPalindrome(String s){
        if(s == null || s.length() == 0) return "";

        int start = 0, end = 0;

        for(int i = 0; i < s.length(); i++){
            int len1 = expandFromTheCenter(s, i, i);
            int len2 = expandFromTheCenter(s, i, i+1);
            int len = Math.max(len1, len2);

            if(len > end - start){
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end+1);
    }

    private int expandFromTheCenter(String s, int left, int right){
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }

        return right - left -1;
    }

    public static void main(String[] args){
        String s = "gabab";
        LongestPalindromicSubstring obj = new LongestPalindromicSubstring();
        String longestSubstring = obj.longestPalindrome(s);
        System.out.println(longestSubstring);
    }
}
