package academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain;

public class StudentsPrinter {
    public void printer(Student student) {

        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.gender);
        System.out.println("-------------------");

        student.name = "Gohan";
    }

}

// R