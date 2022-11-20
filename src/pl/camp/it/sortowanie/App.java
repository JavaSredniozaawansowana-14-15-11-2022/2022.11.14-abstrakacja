package pl.camp.it.sortowanie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();

        integers.add(4);
        integers.add(7);
        integers.add(1);
        integers.add(9);
        integers.add(0);

        System.out.println(integers);

        Collections.sort(integers);

        System.out.println(integers);

        List<Car> cars = new ArrayList<>();

        cars.add(new Car("Toyota", "Corolla", 300.00));
        cars.add(new Car("BMW", "3", 500.00));
        cars.add(new Car("Audi", "A5", 400.00));
        cars.add(new Car("Kia", "Ceed", 200.00));

        System.out.println(cars);

        Collections.sort(cars, new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return (int) (o1.getPrice() - o2.getPrice());
            }
        });

        System.out.println(cars);

        Collections.sort(cars, new Comparator<>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.getBrand().compareTo(o2.getBrand());
            }
        });

        System.out.println(cars);

        /*Car c1 = new Car();
        Car c2 = new Car();

        c1.compareTo(c2);*/
        int a = 5;
        MojInterfejs mojInterfejs = new MojInterfejs() {
            @Override
            public void a() {
                System.out.println("a");
            }

            @Override
            public int b() {
                return 55;
            }

            @Override
            public double c(double a) {
                return 3.3;
            }
        };

        if(true) {
            int x = 5;
        }

        int x = 7;

        mojInterfejs.a();

        mojInterfejs.b();

        cos(mojInterfejs);

        Comparator c = new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return (int) (o1.getPrice() - o2.getPrice());
            }
        };
    }


    public static void cos(MojInterfejs mojInterfejs) {
        mojInterfejs.a();
    }


}
