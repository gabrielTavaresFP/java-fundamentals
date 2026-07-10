package academy.devdojo.maratonajava.javacore.Gassociacao.domain;

public class Students {
    private String name;
    private int age;
    private Seminary seminary;

    public Students(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Students(String name, int age, Seminary seminary) {
        this.name = name;
        this.age = age;
        this.seminary = seminary;
    }

    public void print() {
        System.out.println("Aluno : " + this.name);
        System.out.println("Idade : " + this.age);
        if (seminary == null) return;
        System.out.println("Seminario que estuda : " + seminary.getTitle());

    }


    public Seminary getSeminary() {
        return seminary;
    }

    public void setSeminary(Seminary seminary) {
        this.seminary = seminary;
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
}
