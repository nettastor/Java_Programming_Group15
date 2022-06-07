package day06_07_2022;
/*
24) Number - Reverse negative number
Write a return method that can reverse negative number and return it as int
Method ll return 0 if the number is not negative.
 */
public class ReverseNegativeNumber {
    public static int reverseNegativeNum(int number){
        String reversedNegative="0";
        if(number<0){
            int makePositive=-number;
            while(makePositive>0){
                int digit=makePositive%10;
             makePositive/=10;
                reversedNegative+=digit;}}
        return -Integer.parseInt(reversedNegative);}
    public static void main(String[] args) {
        int number1=-156;
        int number2=100;
        System.out.println("Reversed " + number1+ ": " + reverseNegativeNum(number1)+".");
        System.out.println("Reversed " + number2+ ": " + reverseNegativeNum(number2)+".");}}
/*
        int originalNumber=number;
       int sumOfCubesOfDigits=0;
   while(number>0){
     int digit=number%10;
number/=10;
sumOfCubesOfDigits+=digit*digit*digit;}
return originalNumber==sumOfCubesOfDigits;}
 */