package ro.fasttrackit.course7homework.exercise4;

public class Student {
    private static int sumOfGrades = 0;
    private static int noOfStudents = 0;
    private String name;
    private int grade;

    public Student(String name, int grade) {
        this.name = name;
        if (grade > 0 && grade <= 10) {
            this.grade = grade;
            sumOfGrades += grade;
            noOfStudents++;
        } else {
            System.out.println("Please create a valid student");
        }
    }

    public static double calculateAverageGrade() {
        if (noOfStudents == 0) {
            return 0;
        }

        System.out.println("Total sum of grades = " + sumOfGrades);
        System.out.println("Total number of students = " + noOfStudents);

        return (double) sumOfGrades / noOfStudents;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }
}
