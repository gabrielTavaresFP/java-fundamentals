package academy.devdojo.maratonajava.javacore.Hherança.test;

import academy.devdojo.maratonajava.javacore.Hherança.domain.Adress;
import academy.devdojo.maratonajava.javacore.Hherança.domain.Person;
import academy.devdojo.maratonajava.javacore.Hherança.domain.Worker;

public class HerançaTest01 {
    public static void main(String[] args) {
        Adress adress = new Adress("Rua 7", 72145760);
        Person person = new Person();
        person.setName("Gabriel");
        person.setAge(23);
        person.setAdress(adress);

        person.print();

        System.out.println("------");

        Worker worker = new Worker();
        worker.setName("Gabriel");
        worker.setAge(23);
        worker.setAdress(adress);
        worker.setSalary(5000);

        worker.print();
    }
}
