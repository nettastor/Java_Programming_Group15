package day06_07_2022;
import java.util.ArrayList;
import java.util.Arrays;
public class ArraylistSortInDescending {
/*
28) ArrayList - sorting in descending order
Write a method that can sort the ArrayList in descending order without using the sort method
I ll do without sort method
 */
    public static ArrayList<Integer> sortArraylistInDescending(ArrayList<Integer>arr){
        for (int i = 0; i <arr.size()-1; i++) {
            if(arr.get(i)<arr.get(i+1)){
                int temp= arr.get(i);
                arr.set(i,arr.get(i+1));
                arr.set(i+1, temp);
                i=-1;//Resetting loop after each iteration
            }}
        return arr;}
    public static void main(String[] args) {
        ArrayList<Integer>arr=new ArrayList<>(Arrays.asList(2,5,3,4,1));
        System.out.println("Arraylist sorted in ascending order: " + sortArraylistInDescending(arr)+".");}}