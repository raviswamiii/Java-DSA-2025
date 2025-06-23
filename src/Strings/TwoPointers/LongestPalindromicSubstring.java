package Strings.TwoPointers;

public class LongestPalindromicSubstring {
    public String longestPalindrome(String s){
        if(s == null || s.length() < 1) return "";

        int maxLength = 0;
        String result = "";

        for(int i = 0; i < s.length(); i++){
            for (int j = i; j < s.length(); j++) {
                String sub = s.substring(0, j+1);
                if(isPalindrome(sub) && sub.length() > maxLength){
                    result = sub;
                    maxLength = sub.length();
                }
            }
        } return result;
    }

    private boolean isPalindrome(String str){
        int left = 0;
        int right = str.length() - 1;

        while(left < right){
            if(str.charAt(left++) != str.charAt(right--)){
                return false;
            }
        } return true;
    }



    public static void main(String[] args){
        String s = "babad";
        LongestPalindromicSubstring obj = new LongestPalindromicSubstring();
        String longestPalindrome = obj.longestPalindrome(s);
        System.out.println(longestPalindrome);

    }
}
