package academy.devdojo.maratonajava.javacore.Lclassesabstratas.domain;

public abstract class Worker extends Person {
    protected String name;
    protected double salary;

    public Worker(String name, double salary) {
        this.name = name;
        this.salary = salary;
        calculeBonus();
    }

    @Override
    public void print() {
        System.out.printf("Printing...");
    }

    public abstract void calculeBonus();



}
