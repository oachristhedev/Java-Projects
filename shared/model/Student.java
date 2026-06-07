package shared.model;

public class Student {

    private final String surname;
    private final String firstNames;
    private final String studentID;
    private final String courseName;
    private final char className;
    private final int level;
    private final String phoneNumber;

    public Student(String surname, String firstNames, String studentID, String courseName, char className, int level, String phoneNumber) {

        this.surname = surname;
        this.firstNames = firstNames;
        this.studentID = studentID;
        this.courseName = courseName;
        this.className = className;
        this.level = level;
        this.phoneNumber = phoneNumber;
    }

    public void display() {
        System.out.println();
        System.out.println("STUDENT DATA");
        System.out.println("----------------------------------");
        System.out.println("Surname: " + surname);
        System.out.println("First Names: " + firstNames);
        System.out.println("Student ID: " + studentID);
        System.out.println("Course: " + courseName);
        System.out.println("Class: " + className);
        System.out.println("Level: " + level);
        System.out.println("Phone Number: " + phoneNumber);
    }
}
