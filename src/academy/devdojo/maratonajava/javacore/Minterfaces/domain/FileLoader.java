package academy.devdojo.maratonajava.javacore.Minterfaces.domain;


public class FileLoader implements DataLoader, DataRemover {
    @Override
    public void load() {
        System.out.println("Loading archives data");
    }

    @Override
    public void remove() {
        System.out.println("Removing archives data");
    }

    public static void retrieveMaxDataSize() {
        System.out.println("Inside the retrieveMaxDataSize in the class FileLoader");
    }
}
