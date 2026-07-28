package academy.devdojo.maratonajava.javacore.Kenum.test;

import academy.devdojo.maratonajava.javacore.Kenum.domain.Client;
import academy.devdojo.maratonajava.javacore.Kenum.domain.PaymentType;
import academy.devdojo.maratonajava.javacore.Kenum.domain.TypeClient;

public class ClientTest01 {
    public static void main(String[] args) {
        Client client1 = new Client("Hinata ", TypeClient.PESSOA_FISICA, PaymentType.DEBITO);
        Client client2 = new Client("Kageyama", TypeClient.PESSOA_JURIDICA, PaymentType.CREDITO);

        System.out.println(client1);
        System.out.println(client2);


        System.out.println(PaymentType.CREDITO.discount(100));
        System.out.println(PaymentType.DEBITO.discount(50));

    }
}
