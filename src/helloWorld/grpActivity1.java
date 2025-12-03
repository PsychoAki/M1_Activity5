package helloWorld;
import java.util.Scanner;
public class grpActivity1 {
    public static void main(String[] args) {
        boolean run = true;
        String name = null;
        int num = 0;
        int num2 = 0;
        int num3 = 0;
        int num4 = 0;
        int sum = 0;
        int avg = 0;
        int [] numofSubjects = new int [10]; 


        Scanner sc = new Scanner(System.in);
        while (run == true) { 
            
            {   
                System.out.println("");
                System.out.println("===== STUDENT GRADING SYSTEM =====");
                System.out.println("A. Add Student");
                System.out.println("B. Compute Student Average");
                System.out.println("C. Display Students Information");
                System.out.println("D. Exit");
                System.out.printf("Enter Choice: ");
                String option = sc.nextLine();
                switch (option) {
                case "a" , "A":
                    System.out.println("Option A is selected");  
                    System.out.println("===== MAXIMMUM OF 10 SUBJECTS =====");
                    
                    System.out.printf("Enter your name:");
			        name = sc.nextLine();
                    
                    System.out.printf("Enter your age:");
			        String age = sc.nextLine();
                    num = Integer.parseInt(age);

                    System.out.printf("Enter Student ID:");
			        String studId = sc.nextLine();
                    num2 = Integer.parseInt(studId);

                    System.out.printf("Enter number of subjects:");
			        String numSub = sc.nextLine();
                    num3 = Integer.parseInt(numSub);
                    if (num3 <= numofSubjects.length) {
                        for (int i = 0; i < num3; i++) {
                        System.out.printf("Enter Grade for subject " + (i+1) + ": ");
			            String subj = sc.nextLine();
                        num4 = Integer.parseInt(subj);
                        numofSubjects[i] = num4;
                        }
                    } else {
                        System.out.println("Exceeded number of subjects limit.");
                        name = null;
                        num = 0;
                        num2 = 0;
                        break;
                    }
                    
                    System.out.println("===== Student Saved =====");
                    break;
                case "b" ,"B":
                    if (num3 == 0) {
                        System.out.println("No Grades to be calculated");
                        break;
                    }
                    System.out.println("Option B is selected");
                    
                    for (int i = 0; i < num3; i++) {
                        sum = sum + numofSubjects[i];
                        System.out.println("Grade for subject " + (i+1) + ": " + numofSubjects[i]);
                        avg = sum / num3;
                    }
                    System.out.println("Student Average: " + avg);
                    if (avg >= 75) {
                        System.out.println("Student Passed");
                    }  else {
                        System.out.println("Student Failed");
                    }
                    break;
                case "c" , "C":
                    if (name == null) {
                        System.out.println("No Student Information to be displayed");
                        System.out.println("Please add a student first.");
                        break;
                    }
                    System.out.println("Option C is selected");
                    System.out.println("===== Student Information =====");
                    System.out.println("Student Name: " + name);
                    System.out.println("Student ID: " + num2);
                    System.out.println("Student Age: " + num);
                    System.out.println("Average Grade: " + avg);
                    System.out.println("Status: " + ((avg >= 75) ? "Passed" : "Failed"));
                    System.out.println("===============================");
                    break;
                case "d" , "D":
                    System.out.printf("Exiting..");
                    run = false;
                    break;
                default:
                    System.out.println("Wrong letter choices are A.B.C.D. Please try again.");
                    break;                    
                }
                
            }

        }        
        sc.close();
    }
    
}
