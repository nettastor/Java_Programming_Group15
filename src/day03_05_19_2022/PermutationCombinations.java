package day03_05_19_2022;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class PermutationCombinations {
      public static void main(String[] args) {
            Integer[] arr = {1, 2, 3, 4,5};
            System.out.println(permutationOfThreeDigits(arr));}
        public static String permutationOfThreeDigits(Integer [] arr) {
            int useForNumbOfCombs = 1;
            for (int i = 1; i <= arr.length; i++) {
                useForNumbOfCombs*=i;}
            System.out.println("We have an array with " + arr.length + " elements. There are " + useForNumbOfCombs + " permutations");
            ArrayList<Integer> arrList = new ArrayList<>(Arrays.asList(arr));
            String originalString = "";
            for (int i = 0; i < useForNumbOfCombs; ) {
                Collections.shuffle(arrList);
                if (!originalString.contains(String.valueOf(arrList))) {
                    originalString+= arrList+" \n";
                    i++;}}
            return originalString;}}
/*
14) Array - permutation combinations
Given an array of 3 characters print all permutation combinations from the given characters
 */