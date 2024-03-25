package Lesson29_inheritance_practice;

import Lesson29_inheritance_practice.Student;

public class StudentTest {
    public static void main(String[] args) {
        Student[] students = new Student[]{
                new Student("Ivan", 18, 8.5),
                new Student("Petr", 24, 6.2),
                new Student("Maria", 17, 3.3),
                new Student("Anna", 19, 9.0),
                new Student("Ira", 20, 8.3)
        };

        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println("Student's average grade: " + getAverageGrade(students));
        System.out.println("Student's average grade (foreach): " + getAverageGrade2(students));
    }

    public static double getAverageGrade(Student[] students) {
        double count = 0;
        for (int i = 0; i < students.length; i++) {
            count += students[i].getGrade();
        }
        return count / students.length;
    }

    public static double getAverageGrade2(Student[] students) {
        double count = 0;
        for (Student student : students) {
            count += student.getGrade();
        }
        return count / students.length;
    }

}
