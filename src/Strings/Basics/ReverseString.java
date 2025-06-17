package Strings.Basics;

public class ReverseString {
//    public static void reverseString(char[] s){
//        char[] temp = new char[s.length];
//
//        for(int i = 0; i < s.length; i++){
//            temp[i] = s[s.length -1 - i];
//        }
//
//        for(int i = 0; i < s.length; i++){
//            s[i] = temp[i];
//        }
//    }
//
//    public static void main(String[] args){
//        char[] s = {'h', 'e', 'l', 'l', 'o'};
//        reverseString(s);
//        System.out.println(s);
//    }

    public static void reverseString(char[] s){
        int left = 0;
        int right = s.length - 1;

        while(left < right){
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args){
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        reverseString(s);
        System.out.println(s);
    }
}
