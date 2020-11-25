package ja.task2;

import ja.task2.Human;

public class Main {

    public static void main(String[] args) {

        Car voyager = new Car("Chrysle", "Town & Country", "white", 4.0, "petrol", 7, "van");

        Human bartek = new Human("Bartek", "Janiszewski", 42, 111.1, 176, "withe");

        bartek.car = voyager;

        System.out.println(bartek.car);
        System.out.println(bartek);
    }
}
