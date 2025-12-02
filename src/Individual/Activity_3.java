package Individual;
import java.util.Scanner;

public class Activity_3 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter first Int: ");
        String num1 = sc.nextLine();

        System.out.printf("Enter second Int: ");
        String num2 = sc.nextLine();

        int num3 = Integer.parseInt(num1);  
        int num4 = Integer.parseInt(num2);

        int sum = num3 + num4;
        int diff = num3 - num4;
        int prod = num3 * num4;

        System.out.println("The Sum is: " + sum);
        System.out.println("The Difference is: " + diff);
        System.out.println("The Product is: " + prod);
    }
}
