package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain.Student;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain.StudentsPrinter;


public class StudentTest01 {
    public static void main(String[] args) {
        Student student = new Student();
        Student student2 = new Student();
        StudentsPrinter printer = new StudentsPrinter();

        student.name = "Gabriel";
        student.age = 15;
        student.gender = 'M';

        student2.name = "Catarina";
        student2.age = 15;
        student2.gender = 'F';

        printer.printer(student);
        printer.printer(student2);

        System.out.println("----------------------");

        printer.printer(student);
        printer.printer(student2);

        System.out.println("------------------------");

        student.print2();
        student2.print2();





    }
}
