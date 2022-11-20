package pl.camp.it.abstrakcja;

public class Dog extends Pet {

    @Override
    public void setName(String name) {
        System.out.println("Nowe dzialanie !!!");
    }
}
