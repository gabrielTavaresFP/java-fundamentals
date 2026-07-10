package academy.devdojo.maratonajava.javacore.Gassociacao.domain;

public class Seminary {
    private String title;
    private Location location;
    private Students[] students;

    public Seminary(String name, Location location) {
        this.title = name;
        this.location = location;
    }

    public Seminary(String name, Location location, Students[] students) {
        this.title = name;
        this.location = location;
        this.students = students;
    }

    public void print() {
        System.out.println("Titulo : " + this.title);
        System.out.println("Local : " + location.getLocation());
        if (students == null) return;
        for (Students student : students)
            System.out.println("Alunos : " + student.getName());
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Students[] getStudents() {
        return students;
    }

    public void setStudents(Students[] students) {
        this.students = students;
    }
}
