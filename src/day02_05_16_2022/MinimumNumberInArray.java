package day02_05_16_2022;
import java.util.Arrays;
public class MinimumNumberInArray {

    // quick "cheating method"
    public static int minNumberInArray(int[]arr){
            Arrays.sort(arr);
            return arr[0];}

        //logical approach without sort method
        public static int minNumberInArray2(int [] arr){
            int smallest=arr[0];
            for(int i=0; i<arr.length; i++){
                if(smallest>arr[i]){
                    smallest=arr[i];}}
            return smallest;}

        public static void main(String[] args) { //checking created method
            int [] arr={1,78,-34,7,90,-4,4};
            System.out.println("The largest number of given array will be: " + minNumberInArray(arr)+".");
            System.out.println("The largest number of given array will be: " + minNumberInArray2(arr)+".");}}

/*

10) Array - Find Minimum
Write a method that can find the minimum number from an int Array
 */