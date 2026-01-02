import java.util.Scanner;

public class ChocolateDistribution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int chocs = sc.nextInt();
        int kids = sc.nextInt();

        int each = chocs / kids;
        int remain = chocs % kids;

        System.out.println("The number of chocolates each child gets is " + each +
                    " and the number of remaining chocolates are " + remain);
        
        
        sc.close();
    }
}


