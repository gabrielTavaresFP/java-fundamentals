package academy.devdojo.maratonajava.javacore.Kenum.domain;

public class Client {

    private String name;
    private TypeClient typeClient;
    private PaymentType paymentType;

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", typeClient=" + typeClient +
                ", paymentType=" + paymentType +
                '}';
    }

    public Client(String name, TypeClient typeClient, PaymentType paymentType) {
        this.name = name;
        this.typeClient = typeClient;
        this.paymentType = paymentType;
    }
}
