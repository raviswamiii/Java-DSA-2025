package Strings.TwoPointers;

public class ValidPalindrome {
//    public boolean isPalindrome(String s){
//        StringBuilder cleaned = new StringBuilder();
//
//        for(char c : s.toCharArray()){
//            if(Character.isLetterOrDigit(c)){
//                cleaned.append(Character.toLowerCase(c));
//            }
//        }
//
//        String original = cleaned.toString();
//        String reversed = cleaned.reverse().toString();
//
//        return original.equals(reversed);
//    }
//
//    public static void main(String[] args){
//        String s = "A man, a plan, a canal: Panama";
//        ValidPalindrome obj = new ValidPalindrome();
//        boolean palindrome = obj.isPalindrome(s);
//        System.out.println(palindrome);
//    }

    public boolean isPalindrome(String s){
        int left = 0;
        int right = s.length() - 1;

        while(left < right){
            while(left < right &&!Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }

            while(left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
                return false;
            }

            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args){
        String s = "A man, a plan, a canal: Panama";
        ValidPalindrome obj = new ValidPalindrome();
        boolean palindrome = obj.isPalindrome(s);
        System.out.println(palindrome);
    }
}
