package pl.camp.it.abstrakcja;

public class ClientImpl implements Client {

    private String name;
    private String surname;
    @Override
    public int add(int a, int b) {
        return a+b;
    }

    @Override
    public int diff(int a, int b) {
        return a-b;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getSurname() {
        return this.surname;
    }

    @Override
    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int multiply(int a, int b) {
        return a*b;
    }
}
