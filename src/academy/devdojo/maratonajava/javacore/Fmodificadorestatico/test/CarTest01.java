package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.test;

import academy.devdojo.maratonajava.javacore.Fmodificadorestatico.domain.Car;

public class CarTest01 {

    public static void main(String[] args) {

        Car c1 = new Car("A ", 280);
        Car c2 = new Car("B ", 290);
        Car c3 = new Car("C ", 255);

        Car.setSpeedCap(200);

        c1.print();
        c2.print();
        c3.print();

    }
}
 // R