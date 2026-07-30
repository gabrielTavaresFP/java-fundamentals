package academy.devdojo.maratonajava.javacore.Minterfaces.domain;

public class DatabaseLoader implements DataLoader, DataRemover {

    @Override
    public void load() {
        System.out.println("Loading database data");
    }

    @Override
    public void remove() {
        System.out.println("Removing database data");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checking database permission");
    }

    public static void retrieveMaxDataSize() {
        System.out.println("Inside the retrieveMaxDataSize in the class DatabaseLoader");
    }
}
