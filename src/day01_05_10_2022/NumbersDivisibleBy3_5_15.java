package day01_05_10_2022;
public class NumbersDivisibleBy3_5_15 {
    public static void main(String[] args) {
        int count=1;
        String divBy3="Divisible By 3: ";
        String divBy5="Divisible By 5: ";
        String divBy15="Divisible By 15: ";
        while(count<=100){
if(count%15==0){
    divBy15+=count+" ";
}else if(count%5==0){
    divBy5+=count+ " ";
}else if(count%3==0){
    divBy3+=count+" ";
}count++;}
        System.out.println(divBy3+"\n"+ divBy5+ "\n" + divBy15);}}

/*
5) Numbers - Divisible by 3, 5, 15
Write a program that can print the numbers between 1 ~ 100 that can be divisible by 3, 5, and 15.
if the number can be divisible by 3, 5 and 15, then it should only be displayed in DivisibelBy15' section
if the number can be divisible by 3 but cannot be divisible by 15, then it should only be displayed in DivisibelBy3' section
if the number can be divisible by 5 but cannot be divisible by 15, then it should only be displayed in DivisibelBy5' section
ex:
Output:
Divisible By 15 15 30 45 60 75 90
Divisible By 5 5 10 20 25 35 40 50 55 65 70 80 85 95 100
Divisible By 3 3 6 9 12 18 21 24 27 33 36 39 42 48 51 54 57 63 66 69 72 78 81 84 87 93 96 99
 */