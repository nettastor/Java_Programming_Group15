package day04_06_07_2022;
public class PrimeNumber {
    /*
    22) Numbers - Prime Number
Write a method that can check if a number is prime or not
*/
    public static boolean ifPrimeNumber(int number){
        int count=0;
        if(number>1){
            for (int i = 1; i <=number ; i++) {
                if(number%i==0){
                    count++;}}}
        return count==2;}
//checking created method
    public static void main(String[] args) {
        int num1=11;
        int num2=90;
        System.out.println("Number " + num1+ " is prime: " + ifPrimeNumber(num1)+".");//true
        System.out.println("Number " + num2+ " is prime: " + ifPrimeNumber(num2)+".");}}//false
