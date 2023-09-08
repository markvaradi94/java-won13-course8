package ro.fasttrackit.course7homework.exercise4;

public class StudentMain {
    public static void main(String[] args) {
        Student s1 = new Student("Maria", 8);
        Student s2 = new Student("Paul", 10);
        Student s3 = new Student("Zoli", 2);
        Student s4 = new Student("Erik", 25);
        Student s5 = new Student("Erzsi", 7);

        System.out.println(Student.calculateAverageGrade());
    }
}
