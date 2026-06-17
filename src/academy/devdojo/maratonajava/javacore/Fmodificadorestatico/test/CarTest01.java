package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.test;

import academy.devdojo.maratonajava.javacore.Fmodificadorestatico.domain.Car;

public class CarTest01 {

    public static void main(String[] args) {
        Car.speedCap = 180;

        Car c1 = new Car("Polo", 180);
        Car c2 = new Car("Audi", 300);
        Car c3 = new Car("Rolls Royce", 240);



        c1.print ();
        c2.print ();
        c3.print ();
    }
}
