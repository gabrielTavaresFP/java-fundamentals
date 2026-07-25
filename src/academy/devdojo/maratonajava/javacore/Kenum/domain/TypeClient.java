package academy.devdojo.maratonajava.javacore.Kenum.domain;

public enum TypeClient {
    PESSOA_FISICA(1),
    PESSOA_JURIDICA(2);

    private int value;
    TypeClient (int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
