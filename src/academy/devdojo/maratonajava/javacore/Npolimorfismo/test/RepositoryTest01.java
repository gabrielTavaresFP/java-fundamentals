package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.repository.Repository;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.service.RepositoryArchives;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class RepositoryTest01 {
    public static void main(String[] args) {
       // RepositoryArchives repositoryArchives = new RepositoryArchives(); WRONG
        Repository repository = new RepositoryArchives();
        repository.save();

        List<String> list = new LinkedList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        System.out.println(list);
    }
}
