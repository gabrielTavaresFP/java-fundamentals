package academy.devdojo.maratonajava.javacore.Lclassesabstratas.test;

import academy.devdojo.maratonajava.javacore.Lclassesabstratas.domain.Developer;
import academy.devdojo.maratonajava.javacore.Lclassesabstratas.domain.Manager;
import academy.devdojo.maratonajava.javacore.Lclassesabstratas.domain.Worker;

public class WorkerTest01 {
    public static void main(String[] args) {
        Manager manager1 = new Manager("Luffy", 6000);
        Developer dev1 =  new Developer("Franky", 12000);
        System.out.println(manager1);
        System.out.println(dev1);

    }
}
