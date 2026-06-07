package external;

import java.util.Scanner;
import shared.model.Student;

public class ExternalInput {

    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Surname: ");
            String surname = input.nextLine();
            
            System.out.println("First Names: ");
            String firstNames = input.nextLine();
            
            System.out.println("Student ID: ");
            String studentId = input.nextLine();
            
            System.out.println("Course Name: ");
            String courseName = input.nextLine();
            
            System.out.println("Class: ");
            char className = input.nextLine().charAt(0);
            
            System.out.println("Level: ");
            int level = input.nextInt();
            input.nextLine();
            
            System.out.println("Phone Number: ");
            String phone = input.nextLine();
            
            Student student = new Student(
                    surname,
                    firstNames,
                    studentId,
                    courseName,
                    className,
                    level,
                    phone
            );
            
            System.out.println();
            student.display();
        }
    }
}
