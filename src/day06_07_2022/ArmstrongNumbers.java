package day06_07_2022;
public class ArmstrongNumbers {
//23) Numbers - Armstrong numbers
//    Write a method that can check if a number is Armstrong  number
//I ll do without string manipulation to show more logic
    public static boolean isArmstrong(int number){
        int originalNumber=number;
       int sumOfCubesOfDigits=0;
   while(number>0){
     int digit=number%10;
number/=10;
sumOfCubesOfDigits+=digit*digit*digit;}
return originalNumber==sumOfCubesOfDigits;}
    //checking created method
    public static void main(String[] args) {
        int number1=371;
        int number2=459;
        System.out.println("Number " + number1 + " is Armstrong: "+isArmstrong(number1)+".");//true
        System.out.println("Number " + number2+ " is Armstrong: "+isArmstrong(number2)+".");}}//false


 

