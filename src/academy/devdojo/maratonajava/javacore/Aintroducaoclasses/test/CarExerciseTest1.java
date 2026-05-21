package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.domain.CarExercise;

public class CarExerciseTest1 {
    public static void main(String[] args) {
        CarExercise car = new CarExercise();
        CarExercise car2 = new CarExercise();

        car.name = "Ghost";
        car.model = "Roll's Royce";
        car.carYear = 2025;

        car2.name = "Phantom";
        car2.model = "Ferrari";
        car2.carYear = 2026;

        System.out.println(car.name + " " + car.model + " " + car.carYear);
        System.out.println("\n");
        System.out.println(car2.name + " " + car2.model + " " + car2.carYear);
    }

}
