package academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain;

public class WorkersAverage {
    public void salaryAverage(double... workersAverageSalary) {
        if (workersAverageSalary == null) {
            return;
        }

        double sum = 0;
        for (double num : workersAverageSalary) {
            sum += num;
        }
        System.out.println(sum / workersAverageSalary.length);

    }
}
