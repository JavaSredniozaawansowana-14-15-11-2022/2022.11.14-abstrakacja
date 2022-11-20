package pl.camp.it.abstrakcja;

public abstract class Algorytm {

    public void start() {
        wczytajDane();
        k1();
        k2();
        k3();
        zapiszDane();
    }

    public abstract void wczytajDane();

    private void k1() {
        //???
    }

    private void k2() {

    }

    private void k3() {

    }

    public abstract void zapiszDane();
}
