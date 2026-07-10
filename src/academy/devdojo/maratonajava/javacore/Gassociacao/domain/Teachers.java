package academy.devdojo.maratonajava.javacore.Gassociacao.domain;

public class Teachers {
    private String name;
    private String specialty;
    private Seminary[] seminaries;

    public Teachers(String name, String specialty) {
        this.name = name;
        this.specialty = specialty;
    }

    public Teachers(String name, String specialty, Seminary[] seminaries) {
        this.name = name;
        this.specialty = specialty;
        this.seminaries = seminaries;
    }

    public void print() {
        System.out.println("Professor : " + this.name);
        System.out.println("Especialidade : " + this.specialty);
        if (seminaries == null) return;
        for (Seminary seminary : seminaries) {
            System.out.println("Seminarios que ministra : " + seminary.getTitle());
        }

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public Seminary[] getSeminaries() {
        return seminaries;
    }

    public void setSeminaries(Seminary[] seminaries) {
        this.seminaries = seminaries;
    }
}
