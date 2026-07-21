package academy.devdojo.maratonajava.javacore.Hherança.domain;

public class Person  {
    protected String name;
    protected int age;
    protected Adress adress;
    static {
        System.out.println("Inside of static person initialization block");
    }
    {
        System.out.println("Inside of person initialization block 1");
    }
    {
        System.out.println("Inside of person initialization block 2");
    }

    public Person(String name){
        this.name = name;
        System.out.println("Inside of person constructor");
    }


    public void print() {
        System.out.println("Name:  " + this.name);
        System.out.println("Age: " + this.age);
        if (adress == null) return;
        System.out.println("Address: " + adress.getStreet() + " and CEP  : " + adress.getCep());
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }
}
