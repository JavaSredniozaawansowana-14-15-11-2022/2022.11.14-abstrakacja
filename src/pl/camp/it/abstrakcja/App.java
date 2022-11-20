package pl.camp.it.abstrakcja;

public class App {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("Reksio");
        dog.setRace("Kundel");

        System.out.println(dog.getName());
        System.out.println(dog.getRace());

        Client c = new ClientImpl();
        int x = c.add(4, 5);
        c.setName("Janusz");
        c.setSurname("Kowalski");

        System.out.println(x);
        System.out.println(c.getName());
        System.out.println(c.getSurname());

        ((ClientImpl) c).multiply(4, 6);

        if(c instanceof ClientImpl client) {
            System.out.println(client.multiply(4, 4));
        }

        //Constants.PI = 3.14;
    }
}
