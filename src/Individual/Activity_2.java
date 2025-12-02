package Individual;
import java.util.Scanner;

public class Activity_2 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);

        System.out.printf("Enter your age: ");
        String age = input.nextLine();

        int num = Integer.parseInt(age);
        double num2 = num;

        System.out.println("Your age as Int " + num);
        System.out.println("Your age as Double " + num2);
    }
}
