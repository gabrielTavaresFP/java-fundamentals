package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.domain.Location;
import academy.devdojo.maratonajava.javacore.Gassociacao.domain.Seminary;
import academy.devdojo.maratonajava.javacore.Gassociacao.domain.Students;
import academy.devdojo.maratonajava.javacore.Gassociacao.domain.Teachers;

public class ExerciseTest01 {
    public static void main(String[] args) {
        Location l = new Location("RUA 1");

        Seminary s1 = new Seminary("SEMINARIO 1", l);
        Seminary[] ss = {s1};

        Teachers t1 = new Teachers("GABRIEL", "MATEMATICA");

        Students stu1 = new Students("CATARINA ", 15);
        Students[] stus = {stu1};


        s1.setLocation(l);
        s1.setStudents(stus);


        t1.setSeminaries(ss);

        stu1.setSeminary(s1);

        s1.print();
        System.out.println("---------");
        t1.print();
        System.out.println("---------");
        stu1.print();


    }
}
