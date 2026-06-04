package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain.Person;

public class PersonTest01 {
    public static void main(String[] args) {
        Person person = new Person();

        person.setName("Catarina");
        person.setAge(15);

        //person.print();

        System.out.println(person.getName());
        System.out.println(person.getAge());
    }
}
