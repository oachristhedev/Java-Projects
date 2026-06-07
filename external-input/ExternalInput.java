package external;

import shared.model.Student;
import java.util.Scanner;

public class ExternalInput {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Surname: ");
        String surname = input.nextLine();

        System.out.print("First Names: ");
        String firstNames = input.nextLine();

        System.out.print("Student ID: ");
        String studentId = input.nextLine();

        System.out.print("Course Name: ");
        String courseName = input.nextLine();

        System.out.print("Class: ");
        char className = input.nextLine().charAt(0);

        System.out.print("Level: ");
        int level = input.nextInt();
        input.nextLine();

        System.out.print("Phone Number: ");
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

        student.display();
        input.close();
    }
}
