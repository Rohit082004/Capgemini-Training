package Exception_Handling_05_02_2026;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UncheckedException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
            int a = sc.nextInt();
            int b = sc.nextInt();

            int res = a / b;
            System.out.println(res);
        }
        catch(ArithmeticException e){
            System.out.println("Division by zero is not allowed");
        }
        catch(InputMismatchException e){
            System.out.println("Please enter numeric values only");
        }
    }
}
