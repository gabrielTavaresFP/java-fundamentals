package academy.devdojo.maratonajava.javacore.Lclassesabstratas.domain;

public class Developer extends Worker {
    public Developer(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void calculeBonus() {
        this.salary = this.salary + this.salary * 0.05;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
