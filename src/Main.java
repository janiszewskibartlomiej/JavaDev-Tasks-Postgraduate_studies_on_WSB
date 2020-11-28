import creatures.Human;
import devices.Device;
import devices.Phone;

public class Main {

    public static void main(String[] args) {

        Human human = new Human("Bartek", "Janiszewski", 42, 111.1, 176, "white");


        Device device = new Device("Chrysler", "Voyager", 2008);

        Phone phone = new Phone("teefon",
                "jakis tam",
                2000,
                6.5,
                423482372893753L,
                "zielony");
        System.out.println(phone.toString());

        System.out.println(device);
    }


}
