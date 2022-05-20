package day02_05_16_2022;
import java.util.Arrays;
public class MaximumNumberInArray {

    // quick "cheating method"
    public static int maxNumberInArray(int [] arr){
Arrays.sort(arr);
        return arr[arr.length-1];}

    //logical approach without sort method
    public static int maxNumberInArray2(int [] arr){
        int biggest=arr[0];
        for(int i=0; i<arr.length; i++){
            if(biggest<arr[i]){
                biggest=arr[i];}}
        return biggest;}

    public static void main(String[] args) { //checking created method
        int [] arr={1,78,-34,7,90,-4,4};
        System.out.println("The largest number of given array will be: " + maxNumberInArray(arr)+".");
        System.out.println("The largest number of given array will be: " + maxNumberInArray2(arr)+".");}}
