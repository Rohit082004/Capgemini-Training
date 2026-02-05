package Exception_Handling_05_02_2026;

import java.util.Scanner;

public class CustomException {
    public static void validateAge(int age) throws InvalidAgeException{
        if(age < 18){
            throw new InvalidAgeException("Age must be greater than or equal to 18");
        }
        else{
            System.out.println("Access granted");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
            int age = sc.nextInt();
            validateAge(age);
        }
        catch(InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}

class InvalidAgeException extends Exception{
    public InvalidAgeException(String message){
        super(message);
    }
}
