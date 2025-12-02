package helloWorld;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			// IF ELSE --------------------
			System.out.printf("Enter you age:");
			String age = sc.nextLine();
			int num = Integer.parseInt(age);

			if (num <= 18) {
				System.out.println("Minor");
			} if (num >= 19 && num <= 64) {
				System.out.println("Adult");
			}else {
				System.out.println("Senior");
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// System.out.printf("Enter you age:");
		// String age = sc.nextLine();
		
		// int num = Integer.parseInt(age);
		// double num2 = num;
		
		// String result = (num >= 18) ? "Adult" : "Minor";
		// System.out.println("Your age as int: " + num);	
		// System.out.println("Your age as double: " + num2);
		// System.out.println(result);

		// System.out.printf("Enter first Int:");
		// String num1 = sc.nextLine();
	
		// System.out.printf("Enter second Int:");
		// String num2 = sc.nextLine();
 
		// int num3 = Integer.parseInt(num1);
		// int num4 = Integer.parseInt(num2);

		// int sum = num3 + num4;
		// int diff = num3 - num4;
		// int prod = num3 * num4;

		// System.out.println("Sum: " + sum);
		// System.out.println("Difference: " + diff);
		// System.out.println("Product: " + prod);

		

		// SWITCH CASE ----------------
		// int day = 1;

		// switch (day) {
		// 	case 1:
		// 		System.out.println("Monday");
		// 		break;
		// 	case 2:
		// 		System.out.println("Tuesday");

		// 	default:
		// 		System.out.println("Error");
		// 		break;
		// }
	}

}
