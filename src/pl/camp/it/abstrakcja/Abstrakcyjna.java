package pl.camp.it.abstrakcja;

public abstract class Abstrakcyjna extends AbstrakcyjnaParent {
    private String name;
    private String surname;

    public Abstrakcyjna() {
    }

    public Abstrakcyjna(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    void sayName() {
        System.out.println(this.name);
    }

    abstract void metoda1();

    abstract void metoda2();
}
