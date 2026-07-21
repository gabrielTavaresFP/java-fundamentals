package academy.devdojo.maratonajava.javacore.Hherança.domain;

public class Worker extends Person {
    private double salary;

    static {
        System.out.println("Inside of static worker initialization block");
    }
    {
        System.out.println("Inside of worker initialization block 1");
    }
    {
        System.out.println("Inside of worker initialization block 2");
    }

    public Worker(String name) {
        super(name);
        System.out.println("Inside of worker constructor");
    }

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
