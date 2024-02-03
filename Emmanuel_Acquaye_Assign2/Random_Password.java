package Emmanuel_Acquaye_Assign2;

import java.util.Scanner;

public class Random_Password {

    // The class generates a random password based on user inpur
    public static void main(String[] args) {
    // This is where the program starts execution

    Scanner input = new Scanner(System.in); // create a Scanner object to read user input

    // The block of code below prompts the user to enter the necessary rules for the random password Generation 
    System.out.print("Enter the minimum length of your password:");
    int minLength = input.nextInt();
    System.out.println("");
    System.out.print("Enter the minimum lowercase of your password:");
    int minLowerCase = input.nextInt();
    System.out.println("");
    System.out.print("Enter the minimum uppercase of your password:");
    int minUpperCase = input.nextInt();
    System.out.println("");
    System.out.print("Enter the minimum digits of your password:");
    int minDigits = input.nextInt();
    System.out.println("");
    System.out.print("Enter the minimum number of special characters:");
    int minSpecialCharacters = input.nextInt();
    System.out.println("");
    System.out.print("Enter your specific special characters:");
    String SpecialChar = input.next();
    System.out.println("");
    
    // generate the random password
    String password = generatePassword(minLength, minSpecialCharacters, minUpperCase,minLowerCase,minDigits, SpecialChar);
    String checkPassword = CheckPassword(password, minLength, minSpecialCharacters, minUpperCase, minLowerCase, minDigits, SpecialChar);
    System.out.println("Generated Password: " +password);
    System.out.println("");
    System.out.println(checkPassword);
    input.close();

    }

    public static String generatePassword(int minlen, int minSpecialchar, int minUpper, int minLower, int minDigit, String SpecChar) {
        // creates arrays to store lowercase, uppercase, and special characters

        char[] lowercase= new char[minLower*2];
        char[] uppercase= new char[minUpper*2];
        char[] SpecialCharacter= new char [minSpecialchar *2];
        String passwordgen;
        String DigitString = "";

        // The below code appends to the SpecialCharacter array with the user-specified special characters
        for (int x = 0; x < SpecChar.length(); x++) {
            SpecialCharacter[x] = SpecChar.charAt(x);
        }

        // The below code appends to the Lowercase array with random lowercase characters
        for (int i = 0; i <= minLower; i++) {
            char randomchar = (char) ('a' + Math.random()* ('z' - 'a' +1));
            lowercase[i] += randomchar;

        }
        // The below code appends to the Uppercase array with random uppercase characters
        for (int x = 0; x <= minUpper;x++) {
            char randomchar = (char) ('A' + Math.random()* ('Z' - 'A' +1));
            uppercase[x] = randomchar;
        }
        // The below code concatenates random numbers to the DigitString variable
        for (int y = 0; y <= minDigit; y++) {
            int randomChar = (int)(Math.random() * 10);
            DigitString += randomChar;
        }
        // Append to the Special Character array with random special characters from the user-specified character set
        for (int y = 0; y <= minSpecialchar; y++) {
            char randomChar = SpecChar.charAt((int)(Math.random() * SpecChar.length()));
            SpecialCharacter[y] = randomChar;

        }
    
        String lowerString= new String(lowercase);
        String upperString  = new String(uppercase);
        String Specialstring = new String(SpecialCharacter);
        
        // generate the final password by concatenating the lowercase, uppercase, special character, and digit arrays
        passwordgen = lowerString + upperString+ Specialstring + DigitString;

        // ensure that the password meets the minimum length requirement
        while(passwordgen.length()<= minlen) {
            passwordgen += (int)(Math.random() * 10);

        }
        return passwordgen; 
    }
    
    public static String CheckPassword(String password,int minlen, int minSpecialchar, int minUpper, int minLower, int minDigit, String SpecChar ){
       int NoofVerified = 0;

       // Define the character sets for uppercase letters, lowercase letters, and digits
       String UpperAlphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
       String LowerAlphabets = "abcdefghijklmnopqrstuvwxyz";
       String Digits = "123456789";
       int digitCount = 0;
       int specialCount = 0;
       int lowerCount = 0;
       int upperCount = 0;
       String valid = "The Generated Password Is Valid!!";
       String NotValid = "The Generated Password Is Invalid!!";

       // Check if the password meets the minimum length requirement
        if (password.length()>= minlen){
            NoofVerified +=1;
        }
        else {
            return valid;

        }
        // Iterates through the password generated and the character set "UpperAlphabets" to verify the existence of uppercase characters
        for (int i=0; i<password.length();i ++){
            for (int j=0; j< UpperAlphabets.length();j++){
                if (password.charAt(i) == UpperAlphabets.charAt(j)){
                    upperCount +=1;
                }else{
                    continue;
                }
            }
        }
        //checks if the minimum length of uppercase is met
        if (upperCount >= minUpper){
            NoofVerified += 1;
        }
        // Iterates through the password generated and the character set "LowerAlphabets" to verify the existence of lowercase characters
        for (int i=0; i<password.length();i ++){
            for (int j=0; j< LowerAlphabets.length();j++){
                if (password.charAt(i) == LowerAlphabets.charAt(j)){
                    lowerCount +=1;
                }else{
                    continue;
                }
            }
    }
        //checks if the minimum length of lowercases is met
        if (lowerCount >= minLower){
            NoofVerified += 1;
        }   
        //iterates through the password generated and the specified Special characters to verify the existence of Specified special characters
        for (int i=0; i<password.length();i ++){
            for (int j=0; j< SpecChar.length();j++){
                if (password.charAt(i) == SpecChar.charAt(j)){
                    specialCount +=1;
                }else{
                    continue;
                }
            }
        }
        //checks if the minimum length of Special characters is met
        if (specialCount >= minSpecialchar){
                NoofVerified += 1;
            }
        
        for (int i=0; i<password.length();i ++){
            for (int j=0; j< Digits.length();j++){
                if (password.charAt(i) == Digits.charAt(j)){
                    digitCount +=1;
                }else{
                    continue;
                }
            }
        }
        //checks if the minimum length of Digits is met
        if (digitCount >= minDigit){
            NoofVerified += 1;
        }
            
            //verify if all the rules are met
            if (NoofVerified == 5){
                return valid;
            }
            else{
                return NotValid;
            }
    }
}
    





