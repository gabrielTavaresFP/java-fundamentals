package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain.Worker;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain.WorkersAverage;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain.WorkersData;

public class WorkerTest01 {
    public static void main(String[] args) {
        Worker worker = new Worker();

        WorkersData workersData = new WorkersData();
        WorkersAverage workersAverage = new WorkersAverage();

        worker.setName("Catarina");
        worker.setAge(99);
        worker.setSalary(new double[]{5200, 3600, 7100});


        workersData.printData(worker);
        System.out.println(" ");
        workersAverage.salaryAverage(worker.getSalary());
    }
}
