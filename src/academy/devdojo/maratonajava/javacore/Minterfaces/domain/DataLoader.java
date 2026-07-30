package academy.devdojo.maratonajava.javacore.Minterfaces.domain;

public interface DataLoader {
    public final static int MAX_DATA_SIZE = 10;
    public abstract void load();

    public default void checkPermission() {
        System.out.println("Checking permission");
    }

    public static void retrieveMaxDataSize() {
        System.out.println("Inside the retrieveMaxDataSize in the interface");
    }
}
