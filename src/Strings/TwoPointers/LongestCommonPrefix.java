package Strings.TwoPointers;

public class LongestCommonPrefix {
//    public String longestCommonPrefix(String[] strs){
//        if(strs == null || strs.length == 0) return "";
//
//        for(int i = 0; i < strs[0].length(); i++){
//            char c = strs[0].charAt(i);
//
//            for(int j = 1; j < strs.length; j++){
//                if(i >= strs[j].length() || strs[j].charAt(i) != c){
//                    return strs[0].substring(0,i);
//                }
//            }
//        } return strs[0];
//    }
//
//    public static void main(String[] args){
//        String[] strs = {"flower","flow","flight"};
//        LongestCommonPrefix obj = new LongestCommonPrefix();
//        String part = obj.longestCommonPrefix(strs);
//        System.out.println(part);
//    }

    public String longestCommonPrefix(String[] strs){
        if(strs == null || strs.length == 0) return "";

        int minlen = strs[0].length();
        for(int i = 1; i < strs.length; i++){
            minlen = Math.min(minlen, strs[i].length());
        }

        for(int i = 0; i < minlen; i++){
            char c = strs[0].charAt(i);

            for(int j = 1; j < strs.length; j++){
                if(strs[j].charAt(i) != c){
                    return strs[0].substring(0,i);
                }
            }
        }

        return strs[0].substring(0,minlen);
    }

    public static void main(String[] args){
        String[] strs = {"flower","flow","flight"};
        LongestCommonPrefix obj = new LongestCommonPrefix();
        String part = obj.longestCommonPrefix(strs);
        System.out.println(part);
    }
}
