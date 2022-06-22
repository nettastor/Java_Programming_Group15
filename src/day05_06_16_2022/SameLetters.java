package day05_06_16_2022;
public class SameLetters {
    /* 2.    String - Same letters //Or if anagram
Write a return method that check if a string is build out of the same letters as another string.
Ex:  same("abc",  "cab"); -> true
same("abc",  "abb"); -> false: */
    //I ll do without sort method
    public static boolean ifSameLetters(String str1, String str2) {
        if(str1.length()!=str2.length()){
            return false;
        }else{ for (int i = 0; i < str1.length(); i++) {
              str2=str2.replaceFirst(str1.charAt(i)+"","");}}
        return str2.isEmpty();}
    public static void main(String[] args) {
        //true
        System.out.println("Strings built out of the same letters: " + ifSameLetters("abc", "cab"));
        //false
        System.out.println("Strings built out of the same letters: " + ifSameLetters("abc", "abb"));}}
