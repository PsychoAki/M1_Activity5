package Individual;
import java.util.Scanner;

public class Activity_4 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        String age = sc.nextLine();
        int num = Integer.parseInt(age);

        if (num <= 18) {
            System.out.println("Minor.");
        } else if (num >= 19 && num <= 64) {
            System.out.println("Adult.");  
        } else {
            System.out.println("Senior.");
        }
    }
}
