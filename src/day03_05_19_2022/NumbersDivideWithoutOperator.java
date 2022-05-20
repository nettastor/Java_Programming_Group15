package day03_05_19_2022;
public class NumbersDivideWithoutOperator {
    public static void ifDivisorIs0(int divisor){ //I did this task assuming that int number may be divided evenly or unevenly, divisor and dividend may be positive or negative number, also u cannot divide on 0- it ll give "division" exception. If u want to stop on the point where numbers are positive only //// shows stopping point.
        if(divisor==0){
            System.out.println("You cannot divide on 0.");}}
    public static int divideWithoutDivOperator(int dividend,int divisor) {
        ifDivisorIs0(divisor);
        int retainer =0;
        if(divisor!=0){
            if(dividend%divisor==0&&dividend!=0){
                retainer=1;}
            if(dividend>=0&&divisor>0){
                while(dividend>divisor){
                    dividend-=divisor;
                    retainer++;}////////////////stopping point for only positive numbers
            }else if(dividend<=0&&divisor<0){
                while(dividend<divisor){
                    dividend-=divisor;
                    retainer++;}
            }else if(dividend>=0&&divisor<0){
            retainer=-2;
                while(dividend>=divisor){
                    dividend+=divisor;
                    retainer++;}retainer=retainer*-1;
            }else if(dividend<=0&&divisor>0){
                if(dividend%divisor==0&&dividend!=0){
                    retainer=-1;}else{retainer=-2;}
                while(dividend<divisor){
                    dividend+=divisor;
                    retainer++;} retainer=retainer*-1;}}
        return retainer;
    }public static void main(String[] args) { //testing method
        System.out.println(divideWithoutDivOperator(0,3));// dividend is 0
        System.out.println(divideWithoutDivOperator(3,0));// invalid divisor =0
        System.out.println(divideWithoutDivOperator(-6,-3)); // both numbers are negative ll be divided evenly
        System.out.println(divideWithoutDivOperator(6,3));// both numbers are positive ll be divided evenly
        System.out.println(divideWithoutDivOperator(-6,3)); // dividend is negative, divisor is positive, divided evenly
        System.out.println(divideWithoutDivOperator(6,-3));// dividend is positive, divisor is negative, divided evenly
        System.out.println(divideWithoutDivOperator(-7,-3));// both numbers are negative ll be divided unevenly
        System.out.println(divideWithoutDivOperator(7,3));// both numbers are positive ll be divided unevenly
        System.out.println(divideWithoutDivOperator(-7,3));// dividend is negative, divisor is positive, divided unevenly
        System.out.println(divideWithoutDivOperator(7,-3));// dividend is positive, divisor is negative, divided unevenly
    }}

/*
18) Numbers - Divide without / operator
Write a method that can divide two numbers without using division operator

Please if you have any question just let me know!
 */