package day02_05_16_2022;
public class PasswordValidation {
    public static boolean ifValidPassword(String str){
        boolean hasLower=false; boolean hasUpper=false; boolean hasDigit=false;
        boolean hasSpecialCharacter=false; boolean correctLength=false; boolean containsSpace=false;
        if(str.length()>=6){correctLength=true;}
           if (str.contains(" ")){containsSpace=true;}
            for(int i=0; i<str.length(); i++){
                char letter=str.charAt(i);
                if(Character.isDigit(letter)){hasDigit=true;}
                if(!Character.isDigit(letter)&&!Character.isLetter(letter)&&letter!=' '){hasSpecialCharacter=true;}
                if(Character.isLowerCase(letter)){hasLower=true;}
                if(Character.isUpperCase(letter)){hasUpper=true;}}
        if(!hasLower){System.out.println("Password should have at least one lower case letter.");}
        if(!hasUpper){System.out.println("Password should have at least one upper case letter.");}
        if(!hasDigit){System.out.println("Password should have at least one digit.");}
        if(!hasSpecialCharacter){
            System.out.println("Password should have at least one special character.");}
            if(!correctLength){System.out.println("Password should be at least 6 characters long");}
            if(!containsSpace){System.out.println("Password should contain at least one empty space.");}
        return hasLower&&hasDigit&&hasUpper&&hasSpecialCharacter&&containsSpace&&correctLength;}
    public static void main(String[] args) {
        String str ="y*T8 U";
        System.out.println("Password is valid : " + ifValidPassword(str)+".");}}
/*
String - Password Validation Task
Write a return method that can verify if a password is valid or not. Requirements:
 1. Password MUST be at least 6 characters and should not contain space
2. Password should at least contain one upper case letter
3. Password should at least contain one lowercase letter
4. Password should at least contain one special characters
5. Password should at least contain a digit
6. if all requirements above are met, the method returns true, otherwise returns false
 */