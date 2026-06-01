package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain.Worker;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain.WorkersAverage;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain.WorkersData;

public class WorkerTest01 {
    public static void main(String[] args) {
        Worker worker = new Worker();
        Worker worker2 = new Worker();
        Worker worker3 = new Worker();

        WorkersData workersData = new WorkersData();
        WorkersAverage workersAverage = new WorkersAverage();

        worker.name = "Catarina";
        worker.age = 22;
        worker.salary = 50000;

        worker2.name = "Gabriel";
        worker2.age = 23;
        worker2.salary = 100000;

        worker3.name = "Kauan";
        worker3.age = 23;
        worker3.salary = 75000;

        workersData.printData(worker);
        System.out.println("-----------");
        workersData.printData(worker2);
        System.out.println("-----------");
        workersData.printData(worker3);
        System.out.println("-----------");
        workersAverage.salaryAverage(worker.salary,worker2.salary,worker3.salary);

    }
}
