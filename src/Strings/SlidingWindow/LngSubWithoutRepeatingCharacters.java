package Strings.SlidingWindow;

public class LngSubWithoutRepeatingCharacters {
    public int longestSubstring(String s){
       int maxLength = 0;

       for(int i = 0; i < s.length(); i++){
           for (int j = i; j < s.length(); j++) {
               if(allUnique(s,i,j)){
                   int length = j - i + 1;
                   if(length > maxLength){
                       maxLength = length;
                   }
               }
           }
       }

       return maxLength;
    }

    private boolean allUnique(String s, int start, int end){
        for (int i = start; i <= end; i++){
            for (int j = i + 1; j <= end; j++) {
                if(s.charAt(i) == s.charAt(j)){
                    return false;
                }
            }
        } return true;
    }

    public static void main(String[] args){
        String s = "abcabcbb";
        LngSubWithoutRepeatingCharacters obj = new LngSubWithoutRepeatingCharacters();
        int lengthOfLongestSubstring = obj.longestSubstring(s);
        System.out.println(lengthOfLongestSubstring);
    }
}
