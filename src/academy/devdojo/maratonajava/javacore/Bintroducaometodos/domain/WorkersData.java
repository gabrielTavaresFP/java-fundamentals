package academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain;

public class WorkersData {
    public void printData(Worker worker) {
        System.out.println(worker.name);
        System.out.println(worker.age);
       for (double num : worker.salary) {
           System.out.print(num + "  ");
       }
    }
}
