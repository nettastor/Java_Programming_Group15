package day01_05_10_2022;
public class DivideNoDivOperator {
    public static int divideWithoutOperator(int dividend, int divisor){
        int result = 0;
        if(dividend>=0&&divisor>0){
            while(dividend>=divisor){
                dividend-=divisor;
                result++;}}
        return result;}
    public static void main(String[] args) {
        System.out.println(divideWithoutOperator(30, 2));}}
/*
18) Numbers - Divide without / operator
Write a method that can divide two numbers without using division operator

Please if you have any question just let me know!
 */