package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.domain.Student;

public class StudentTest01 {
    public static void main(String[] args) {
        Student student = new Student();
        Student student2 = new Student();

        student.name = "Catarina";
        student.age = 15;
        student.gender = 'F';

        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.gender);
        System.out.println("\n");
        System.out.println(student2.name);
        System.out.println(student2.age);
        System.out.println(student2.gender);


    }
}
