package day03_05_19_2022;
public class PermutationCombinations {
    public static void allArrayOf3Permutations(int arr[]){
        for (int i = 0; i < arr.length; i++ ){
         for(int j=0; j<arr.length;j++){
             for(int k=0; k<arr.length;k++){
             if(arr[i]!=arr[j]&&arr[j]!=arr[k]&&arr[i]!=arr[k]){
             System.out.print(arr[i]+""+arr[j]+arr[k]+" ");}}}}}
    public static void main(String[] args) { // checking created method
int arr[]={1,2,3};
allArrayOf3Permutations(arr);}}
/*
public static void main(String[] args) {
        int[][] first = {
                {1, 2, 3},
                {2, 5, 10},
                {0, 3, 20}
        };
        int[][] second = {
                {10, 4, 3},
                {5, 2, 7},
                {100, 20, 5}
        };
        int [][] result = new int[first.length][first.length];
        for (int i = 0; i < first.length; i++) {
            for (int j = 0; j < first[i].length; j++) {
               result [i][j] = first[i][j]*second[i][j];
            }
        }
        System.out.println(Arrays.deepToString(result));
    }
}

14) Array - permutation combinations
14) Array - permutation combinations
Given an array of 3 characters print all permutation combinations from the given characters

 */