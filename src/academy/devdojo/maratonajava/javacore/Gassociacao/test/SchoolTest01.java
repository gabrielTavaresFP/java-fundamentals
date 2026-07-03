package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.domain.School;
import academy.devdojo.maratonajava.javacore.Gassociacao.domain.Teacher;

public class SchoolTest01 {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Éder");
        Teacher teacher2 = new Teacher("Ramon");

        Teacher[] ts = {teacher1, teacher2};

        School school = new School("Objetivo", ts);


        school.print();

    }
}
