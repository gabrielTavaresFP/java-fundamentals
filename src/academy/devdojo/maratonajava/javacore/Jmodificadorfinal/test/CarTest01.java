package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.test;

import academy.devdojo.maratonajava.javacore.Jmodificadorfinal.domain.Car;
import academy.devdojo.maratonajava.javacore.Jmodificadorfinal.domain.Comprador;
public class CarTest01 {
    public static void main(String[] args) {
        Car car = new Car();

        System.out.println(Car.SPEED_CAP);
        System.out.println(car.COMPRADOR);
        car.COMPRADOR.setName("Gabriel");
        System.out.println(car.COMPRADOR);

    }
}
