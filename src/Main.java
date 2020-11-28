import creatures.Human;
import devices.Car;
import devices.Phone;

public class Main {

    public static void main(String[] args) {

        Human human = new Human("Bartek", "Janiszewski", 42, 111.1, 176, "white");
        human.setCash(200.0);
//        Device device = new Device("Chrysler", "Voyager", 2008);

        Phone phone = new Phone("teefon",
                "jakis tam",
                2000,
                6.5,
                423482372893753L,
                "zielony");
        System.out.println(phone.toString());

        Car car = new Car("Chrysler", "voyager", "white", 4.0, "petrol", 7, "van", 35000, 2008);

        human.phone = phone;

        Human brotherInLow = new Human("Zenek", "Cos", 22, 55.0, 170, "white");
        brotherInLow.setCash(1000.0);

        try {
            phone.sell(human, brotherInLow, 50.0);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Dalsza logika");
        System.out.println(car);
    }


}
