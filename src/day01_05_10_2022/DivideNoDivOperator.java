package day01_05_10_2022;
public class DivideNoDivOperator {
    /*
    I did task assuming that dividend and divisor are whole numbers and divisor shouldn't be equal to 0.
    There are will be different starting points depending on if the numbers will are fully divisible on each other or not, if they are positive or negative.
     */
    public static void ifDivisorIs0(int divisor){
        if(divisor==0){
        System.out.println("You cannot divide on 0.");}}
    public static int divideWithoutDivOperator(int dividend,int divisor) {
        ifDivisorIs0(divisor);
        int retainer =0;
        if(divisor!=0){
            if(dividend%divisor==0){
                retainer=1;}
        if(dividend>0&&divisor>0){
            while(dividend>divisor){
               dividend-=divisor;
               retainer++;}
        }else if(dividend<0&&divisor<0){
            while(dividend<divisor){
                dividend-=divisor;
                retainer++;}
            }else if(dividend>0&&divisor<0){
            if(dividend%divisor==0){
            retainer=-1;}else{retainer=-2;}
                while(dividend>divisor){
                    dividend+=divisor;
                    retainer++;}retainer=retainer*-1;
        }else if(dividend<0&&divisor>0){
            if(dividend%divisor==0){
                retainer=-1;}else{retainer=-2;}
            while(dividend<divisor){
                dividend+=divisor;
                retainer++;} retainer=retainer*-1;}}
        return retainer;
    }public static void main(String[] args) {
        System.out.println(divideWithoutDivOperator(1,3));}}

/*2) Numbers - Divide without / operator
        Write a method that can divide two numbers without using division operator */