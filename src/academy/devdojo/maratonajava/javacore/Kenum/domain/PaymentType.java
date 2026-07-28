package academy.devdojo.maratonajava.javacore.Kenum.domain;

public enum PaymentType {
    DEBITO{
        @Override
        public double discount(double value) {
            return value * 0.1;
        }
    },
    CREDITO{
        @Override
        public double discount(double value) {
            return value * 0.05;
        }
    };

    public double discount(double value) {
       return 0;

    }
}