import java.util.Scanner;

public class TextToNumber{
    static Scanner kb = new Scanner (System.in);

    public static void main(String[] args){
        String convertedNumber = "";
        System.out.print("Please Enter Phone Number: ");
        String phoneNumber = kb.next();

        String upperPhoneNumber = phoneNumber.toUpperCase();

        for(int i =0; i < upperPhoneNumber.length(); i++){
            if(upperPhoneNumber.charAt(i) == 'A' || upperPhoneNumber.charAt(i) == 'B' || upperPhoneNumber.charAt(i) == 'C'){
                convertedNumber = convertedNumber + "2";
            }
            else if(upperPhoneNumber.charAt(i) == 'D' || upperPhoneNumber.charAt(i) == 'E' || upperPhoneNumber.charAt(i) == 'F'){
                convertedNumber = convertedNumber + "3";
            }
            else if(upperPhoneNumber.charAt(i) == 'G' || upperPhoneNumber.charAt(i) == 'H' || upperPhoneNumber.charAt(i) == 'I'){
                convertedNumber = convertedNumber + "4";
            }
            else if(upperPhoneNumber.charAt(i) == 'J' || upperPhoneNumber.charAt(i) == 'K' || upperPhoneNumber.charAt(i) == 'L'){
                convertedNumber = convertedNumber + "5";
            }
            else if(upperPhoneNumber.charAt(i) == 'M' || upperPhoneNumber.charAt(i) == 'N' || upperPhoneNumber.charAt(i) == 'O'){
                convertedNumber = convertedNumber + "6";
            }
            else if(upperPhoneNumber.charAt(i) == 'P' || upperPhoneNumber.charAt(i) == 'Q' || upperPhoneNumber.charAt(i) == 'R'|| upperPhoneNumber.charAt(i) == 'S'){
                convertedNumber = convertedNumber + "7";
            }
            else if(upperPhoneNumber.charAt(i) == 'T' || upperPhoneNumber.charAt(i) == 'U' || upperPhoneNumber.charAt(i) == 'V' ){
                convertedNumber = convertedNumber + "8";
            }
            else if(upperPhoneNumber.charAt(i) == 'W' || upperPhoneNumber.charAt(i) == 'X' || upperPhoneNumber.charAt(i) == 'Y'|| upperPhoneNumber.charAt(i) == 'Z'){
                convertedNumber = convertedNumber + "9";
            }
            else{
                convertedNumber = convertedNumber + upperPhoneNumber.charAt(i);
            }
        }
        System.out.println("Your Converted Number is: " + convertedNumber);

        }
    
    }
