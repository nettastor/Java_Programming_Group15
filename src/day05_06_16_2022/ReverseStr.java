package day05_06_16_2022;
public class ReverseStr {
    /* 5.    String - Reverse
Write a return method that can reverse String
Ex: Reverse("ABCD"); ==> DCBA */
    public static String Reverse(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed +=str.charAt(i);}
        return reversed;}
    public static void main(String[] args) {
        System.out.println("Reversed string: " + Reverse("ABCD")); //DCBA
    }}
