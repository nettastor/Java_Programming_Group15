package day05_06_16_2022;
public class FrequencyOfChars {
    /*1.    String - Frequency of Characters
Write a return method that can find the frequency of characters
Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2 */ //I ll do without Collections.frequency() method
    public static String frequencyOfChars(String str){
        String checked ="";
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            if(checked.contains(""+ str.charAt(i))){
                continue;}
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;}}
            checked+=str.charAt(i)+""+count;
        }return checked;}
    public static void main(String[] args) {
        System.out.println(frequencyOfChars("AAABBCDD")); //Result: A3B2C1D2
    }}







/*
 String s = "alla";
        String checked ="";
        for (int i = 0; i < s.length(); i++) {
            int count = 0;// everytime the outer loop iterates, the counter is set back to 0. It is reset between every character
            char letter = s.charAt(i);
            if(checked.contains(""+ letter)){
                continue;
            }
            for (int j = 0; j < s.length(); j++) {
                char eachLetter = s.charAt(j);
                if (letter == eachLetter) { // s.charAt(i) == s.charAt(j)
                    count++;
                }
            } // end of inner loop
            System.out.println(letter + " - " + count);
            checked+=letter;
        }
    }
}
 */
