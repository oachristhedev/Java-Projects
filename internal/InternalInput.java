package internal;

import shared.model.Student;

public class InternalInput {

    public static void main(String[] args) {

        Student student = new Student(
            "Odoom",
            "Christopher Abuenyi",
            "04/2024/2197D",
            "Computer Network Management",
            'C',
            200,
            "+233-54-580-1717"
        );

        student.display();
    }
}