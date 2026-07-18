package academy.devdojo.maratonajava.javacore.Hherança.domain;

public class Worker extends Person {
    private double salary;

    public void print() {

        super.print();
        System.out.println(this.salary);
    }

    public void paymentRelatory () {
        System.out.println("I, "+ this.name + ", received the salary of " +  this.salary);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
