package day03_05_19_2022;
import java.util.Arrays;
public class ConcatenateTwoArrays {
    public static int [] concatenate2Arrays(int arr1[],int arr2[]){// task should be logical so i ll not use copy method
        int count=arr1.length;
        int arr[]=new int [arr1.length+arr2.length];
        for (int i=0;i<arr1.length;i++){
            arr[i]=arr1[i];}
        for(int i=0;i<arr2.length;i++){
            arr[count]=arr2[i];
            count++;}
        return arr;}
    public static void main(String[] args) {// checking created method
        int arr1 []={1,2,3};
        int arr2[]={4,5,6};
        System.out.println("Concatenated 2 arrays: " + Arrays.toString(concatenate2Arrays(arr1,arr2)));}}
/*
16) Array - Concat two arrays
Write a return method that can concate two arrays

 */