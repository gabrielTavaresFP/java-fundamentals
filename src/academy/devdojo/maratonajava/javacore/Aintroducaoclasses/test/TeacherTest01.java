package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.domain.Teacher;

public class TeacherTest01 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.name = "Mestre Kami";
        teacher.age = 140;
        teacher.gender = 'M';

        System.out.println(teacher.name + " age: " + teacher.age + " gender: " + teacher.gender);

    }
}
