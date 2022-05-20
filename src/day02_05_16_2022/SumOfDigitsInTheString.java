package day02_05_16_2022;
public class SumOfDigitsInTheString {
    public static int sumOfDigits(String str) {
        //assuming that u meant sum of numbers in the string which may be more than one digit
        String digits = "0";
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                digits += str.charAt(i);
            } else {
                sum+= Integer.parseInt(digits);
                digits = "0";}}
        return sum+Integer.parseInt(digits);}
    public static void main(String[] args) {//checking created method
        String s = "pam4ai1005lala1at45";
        System.out.println("Sum of digits in given string will be " + sumOfDigits(s)+".");}}

