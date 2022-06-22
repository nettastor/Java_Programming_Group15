package day05_06_16_2022;
import java.util.Arrays;
public class SortLetersAndNumbers3 {
    public static void main(String[] args) {
        System.out.println(sortLettersAndNumbers("DC501GCCCA098911"));}
    public static String sortLettersAndNumbers(String str) {
        String digits = "";
        String letters="";
       String allSorted = "";
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                digits += str.charAt(i);
              char []arr=letters.toCharArray();
                Arrays.sort(arr);
                allSorted+=Arrays.toString(arr);
                letters="";
            } else {
                letters+=str.charAt(i);
              char [] arr=digits.toCharArray();
              Arrays.sort(arr);
              allSorted+=Arrays.toString(arr);
              digits="";}}
        char [] letter=letters.toCharArray();
        Arrays.sort(letter);
        char [] number=digits.toCharArray();
        Arrays.sort(number);
        return (allSorted+Arrays.toString(letter)+Arrays.toString(number)).replace("[","").replace("]","").replace(", ",""); //CD015ACCCG011899
    }
}


