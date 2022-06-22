package day05_06_16_2022;
public class StringRemoveDuplicates {
    /* 3.    String - Remove Duplicates
Write a return method that can remove the duplicated values from String
Ex:  removeDup("AAABBBCCC") ==> ABC */
    //I ll do without Collections.frequency() method
    public static String removeDup(String str){
        String uniqueChars="";
        for (int i = 0; i <str.length() ; i++) {
if(!uniqueChars.contains(str.charAt(i)+"")){
    uniqueChars+=str.charAt(i);}}
        return uniqueChars;}
    public static void main(String[] args) {
        System.out.println(removeDup("AAABBBCCC"));
    }}
//Result: ABC