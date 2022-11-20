package pl.camp.it.abstrakcja;

public interface Client {
    int a = 5;

    int add(int a, int b);
    int diff(int a, int b);

    String getName();
    void setName(String name);
    String getSurname();
    void setSurname(String surname);
}
