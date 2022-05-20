package day01_05_10_2022;
public class EvenOrOdd {
    public static void identify(int num) {
        if (num % 2 == 0) {
            System.out.println("Even");
        }else{
            System.out.println("Odd");}}
    public static void main(String[] args) {//checking created method
        identify(5); identify(6);}}
