package chapter8;

import java.util.Scanner;
public class PasswordValidator {
    public static String oldPassword = "password";
    public static String password;
    public static String username;
    public static int passwordLength = 8;
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String args[]){
        getUsername();
        getPassword();
    }
    public static void getUsername(){
        System.out.println("Enter your username");
        username = scanner.next();
    }
    public static void getPassword(){
        System.out.println("Enter your password");
        password = scanner.next();
        isPasswordValid();
    }


    public static boolean isLongEnough(String password){
        if(password.length()<passwordLength){
            return false;
        }else return true;
    }
    public static boolean hasUpperCase(String password){
        var modifiedPassword = new StringBuilder(password);
        for(int i=0; i<password.length();i++){
            if(Character.isUpperCase(modifiedPassword.charAt(i))){
                return true;
            }
        }
        return false;
    }
    public static boolean hasSpecialCharacter(String password){
        var modifiedPassword = new StringBuilder(password);
        for(int i=0; i<modifiedPassword.length();i++){
            if(!Character.isAlphabetic(modifiedPassword.charAt(i)) && !Character.isDigit(modifiedPassword.charAt(i))){
                return true;
            }
        }
        return false;
    }
    public static boolean doesNotHaveUsername(String password, String username){
        if(password.toLowerCase().contains(username.toLowerCase())){
            return false;
        }else return true;
    }
    public static boolean notSameAssOldPassword(String oldPassword, String password){
        if(password.compareToIgnoreCase(oldPassword) == 0){
            return false;
        }else return true;
    }
    public static void isPasswordValid(){
        if(isLongEnough(password) && hasUpperCase(password) && hasSpecialCharacter(password) && doesNotHaveUsername(password, username) && notSameAssOldPassword(oldPassword, password)){
            System.out.println("Congratulation, your password has been changed");
            oldPassword = password;
            scanner.close();
        } else {
            System.out.println("Your password has to contain at least 8 characters, one uppercase letter, special character and cant be same as your username and old password. Try again");
            getPassword();
        }
    }
}
