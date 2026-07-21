package academy.devdojo.maratonajava.javacore.Hherança.test;

import academy.devdojo.maratonajava.javacore.Hherança.domain.Worker;

public class HerancaTest02 {
    public static void main(String[] args) {
        // 0 - Bloco de inicialização estático da super classe é executado quando a JVM carregar classe pai
        // 1 - Bloco de inicialização estático da subclasse é executado quando a JVM carregar classe filha
        // 2 - Alocado espaço em memória pro objeto da superclasse
        // 3 - Cada atributo de superclasse é criado e inicializado com valores default ou o que for passado
        // 4 - Bloco de inicialização da superclasse é executado na ordem em que aparece
        // 5 - Construtor é executado da superclasse
        // 6 - Alocado espaço em memória pro objeto da subclasse
        // 7 - Cada atributo de subclasse é criado e inicializado com valores default ou o que for passado
        // 8 - Bloco de inicialização da subclasse é executado na ordem em que aparece
        // 9 - Construtor é executado da subclasse

        Worker worker = new Worker("A");
    }
}
