package Strings.SlidingWindow;

public class MinimumWindowSubstring {
    public String minimumWindowSubstring(String s, String t){
        int minLength = Integer.MAX_VALUE;
        int startIndex = -1;

        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                int length = j - i + 1;
                if(containsAllChars(s, t, i, j)){
                    if(length < minLength){
                        minLength = length;
                        startIndex = i;
                    }
                }
            }
        }

        if(startIndex == -1)  return "";
        StringBuilder result = new StringBuilder();
        for(int i = startIndex; i < startIndex + minLength; i++){
            result = result.append(s.charAt(i));
        }
        return result.toString();
    }

    private boolean containsAllChars(String s, String t, int start, int end){
        int[] tFreq = new int[128];
        int[] sFreq = new int[128];

        for (int k = 0; k < t.length(); k++){
            tFreq[t.charAt(k)]++;
        }

        for (int k = start; k <= end; k++){
            sFreq[s.charAt(k)]++;
        }

        for(int i = 0; i < 128; i++){
            if(sFreq[i] < tFreq[i]){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] agrs){
        String s = "ADOBECODEBANC";
        String t = "ABC";
        MinimumWindowSubstring obj = new MinimumWindowSubstring();
        String subString = obj.minimumWindowSubstring(s,t);
        System.out.println(subString);
    }
}
