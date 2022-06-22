package day04_06_07_2022;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*
25) ArrayList - Remove "Ahmed"
Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....
Write a java operation to remove all the names named Ahmed
 */
public class RemoveAhmed {
    public static List<String>removeAhmed(List<String>list){
        for (int i = 0; i <list.size() ; i++) {
            if(list.get(i).equalsIgnoreCase("Ahmed")){
                list.remove(list.get(i));}}
        return list;}
    //checking created method
    public static void main(String[] args) {
        List<String>list=new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));
        System.out.println("List with remover \"Ahmed\" names: " + removeAhmed(list)+".");}}
