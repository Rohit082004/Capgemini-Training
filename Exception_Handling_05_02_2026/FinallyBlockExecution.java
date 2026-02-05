package Exception_Handling_05_02_2026;

import java.util.Scanner;

public class FinallyBlockExecution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
            int a = sc.nextInt();
            int b = sc.nextInt();

            int res = a/b;
            System.out.println(res);
        }
        catch (ArithmeticException e){
            System.out.println("Division by 0 not allowed");
        }
        finally {
            System.out.println("Operation completed");
        }
    }
}
