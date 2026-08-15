package academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain;

public class WorkersData {
    public void printData(Worker worker) {

        System.out.println(worker.getName());
        System.out.println(worker.getAge());
        if (worker.getSalary() == null) {
            return;
        }
        for (double num : worker.getSalary()) {
            System.out.print(num + " ");

        }
    }
}
// R