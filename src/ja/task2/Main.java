package ja.task2;

public class Main {

    public static void main(String[] args) {

        Car voyager = new Car("Chrysle", "Town & Country", "white", 4.0, "petrol", 7, "van", 35000);

        Human bartek = new Human("Bartek", "Janiszewski", 42, 111.1, 176, "withe");

        bartek.setSalary(5538);

        System.out.println(bartek.getCar());
        System.out.println(bartek);

        bartek.getSalary();


        System.out.println(bartek.getSalary());

        System.out.println(bartek.getCar());

        bartek.setCar(voyager);

        System.out.println(bartek.getCar().value);

        bartek.getCar().value -= 2000;

        System.out.println(bartek.getCar().value);

        System.out.println(bartek.getCar());
    }
}
