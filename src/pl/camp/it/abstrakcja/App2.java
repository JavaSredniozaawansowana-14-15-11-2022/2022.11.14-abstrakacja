package pl.camp.it.abstrakcja;

public class App2 {
    public static void main(String[] args) {
        Abstrakcyjna abstrakcyjna = new JakasKlasa();
        abstrakcyjna.metoda1();

        Algorytm algorytm = new MojAlgorytm();
        algorytm.start();
    }
}
