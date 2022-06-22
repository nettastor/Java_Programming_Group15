package day05_06_16_2022;
public class FindUnique {
    /* 4.    String - Find the unique
Write a return method that can find the unique characters from the String
Ex:  unique("AAABBBCCCDEF") ==> "DEF"; */
    public static String findUnique(String str){
        String unique="";
        for (int i = 0; i <str.length() ; i++) {
            if(str.indexOf(str.charAt(i))==str.lastIndexOf(str.charAt(i))){
               unique+=str.charAt(i);}}
        return unique;}
    public static void main(String[] args) {
        System.out.println(findUnique("AAABBBCCCDEF")); //Result: DEF
       }}
