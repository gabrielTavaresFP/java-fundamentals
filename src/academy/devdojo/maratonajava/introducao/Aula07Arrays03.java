package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        String [] names  = new String [4];
        names[0] = "Catarina";
        names[1] = "Gabrielll";
        names[2] = "BiluBiluBiluBiluBiluBilu";

        for (int i = 0; i < names.length ; i++) {
            System.out.println(names[i]);
        }
        //names = new String[5];
        System.out.println(names[3]);
    }
}
