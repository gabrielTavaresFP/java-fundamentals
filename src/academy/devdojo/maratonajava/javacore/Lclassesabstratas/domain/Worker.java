package academy.devdojo.maratonajava.javacore.Lclassesabstratas.domain;

public abstract class Worker {
    protected String name;
    protected double salary;

    public Worker(String name, double salary) {
        this.name = name;
        this.salary = salary;
        calculeBonus();
    }

    public abstract void calculeBonus();



}
