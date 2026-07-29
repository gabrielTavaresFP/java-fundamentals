package academy.devdojo.maratonajava.javacore.Kenum.domain;

public enum TypeClient {
    PESSOA_FISICA(1, "Pessoa Física"),
    PESSOA_JURIDICA(2, "Pessoa Jurídica");

    private int value;
    private String relatoryName;

    TypeClient(int value,String relatoryName) {
        this.value = value;
        this.relatoryName = relatoryName;
    }

    public static TypeClient clientTypePerRelatoryName (String relatoryName) {
        for (TypeClient typeClient : values()) {
            if (typeClient.getRelatoryName().equals(relatoryName)) {
                return typeClient;
            }
        }
        return null;
    }

    public int getValue() {
        return value;
    }

    public String getRelatoryName() {
        return relatoryName;
    }
}
