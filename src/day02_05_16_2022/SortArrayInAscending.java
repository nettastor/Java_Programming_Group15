package day02_05_16_2022;
import java.util.Arrays;
public class SortArrayInAscending {
    public static int [] ascendingOrder(int [] arr){
        for (int j = 0; j < arr.length - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
                j = -1;}}//reset the loop back
        return arr;}

    public static void main(String[] args){// checking created method
        int [] arr={56,3,-8,23,14,9};
        System.out.println(Arrays.toString(ascendingOrder(arr)));}}
