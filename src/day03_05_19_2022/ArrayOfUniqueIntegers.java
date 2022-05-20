package day03_05_19_2022;
import java.util.ArrayList;
import java.util.Random;
public class ArrayOfUniqueIntegers {
        public static ArrayList<Integer> sumZero(int n) {
            ArrayList<Integer> result = new ArrayList(n);
            Random random = new Random();
            while(result.size()/2<n/2){
                Integer number =random.nextInt(n);
                if(!result.contains(number)&&number!=0){
                    result.add(number);
                    result.add(-number);}}
            if (n%2!=0){
                result.add(0);}
            return result;
        }
        public static void main(String[] args) { //checking the obtained result =[10, -10, 5, -5, 11, -11, 9, -9, 4, -4, 8, -8] when even number
            System.out.println(sumZero(12));
            System.out.println(sumZero(13));//odd number [1, -1, 7, -7, 3, -3, 4, -4, 11, -11, 6, -6, 0]
             }}

/*
Array - N unique integers that sum up to 0
Write a function:
that, given an integer N (1 < N < 100), returns an array containing N unique integers that sum up to 0. The function can return any such array. For example, given N = 4, the function could return [1,0, -3,2] or [-2,1, -4,5]. The answer [1, -1,1,3] would be incorrect (because value 1 occurs twice). For N = 3 one of the possible answers is [-1,0,1]  (but there are many more correct answers).

 */