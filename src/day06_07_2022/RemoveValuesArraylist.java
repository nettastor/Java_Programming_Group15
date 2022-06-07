package day06_07_2022;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class RemoveValuesArraylist {
    /*
26) ArrayList - Remove some values
Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.
I ll put number 100 as parameter that way i ll be able to change it any time
 */
    public static List<Integer>removeValuesGraterThen(List<Integer> list,int number){
        for (int l = 0; l <list.size() ; l++) {
            if(list.get(l)>number){
                list.remove(list.get(l));}}
        return list;}
 //checking created method
    public static void main(String[] args) {
        List<Integer>list=new ArrayList<>(Arrays.asList(1, 2,345, 3,100, 4, 5, 6,105 ));
        int greaterThen=100;
        System.out.println("Numbers up to " + greaterThen+ ": " + removeValuesGraterThen(list,greaterThen)+".");}}
