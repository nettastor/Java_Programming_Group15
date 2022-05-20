package day01_05_10_2022;
public class Finra {
    public static void finra(int num){
        if(num%3==0&&num%5==0){
            System.out.println("FINRA");
        }else if(num%3==0){
            System.out.println("FIN");
        }else if(num%5==0){
            System.out.println("RA");
        } else{
            System.out.println("Number neither divisible on 3 no on 5.");}}
    public static void main(String[] args) {
        finra(15); finra(10); finra(24); finra(67);}}
/*
3) Numbers - FINRA
Write a method which prints out the numbers from 1 to 30 but for numbers which are a multiple of 3, print "FIN" instead of the number and for numbers which are a multiple of 5, print "RA" instead of the number. for numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number.
 */