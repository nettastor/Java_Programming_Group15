package quiz;
public class Task {
    public static boolean isPrime(int num){
        int count=0;
        if(num>1){
        for (int i = 2; i <=num ; i++) {
            if(num%i==0){
                count++;
            }
        }}
        return count==1;
    }
    public static void main(String[] args) {
       int num1=11;
       int num2=90;
        System.out.println(isPrime(num1));
        System.out.println(isPrime(num2));
    }
}
