package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.domain;

public class Car {
    private String name;
    private double maxSpeed;
    public static double speedCap = 250;

    public Car(String name, double maxSpeed) {
        this.name = name;
        this.maxSpeed = maxSpeed;
    }

    public void print() {
        System.out.println();
        System.out.print(this.name + " ");
        System.out.print(this.maxSpeed + " ");
        System.out.print(Car.speedCap + " ");
    }

    public static double getSpeedCap() {
        return speedCap;
    }

    public static void setSpeedCap(double speedCap) {
        Car.speedCap = speedCap;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

}
