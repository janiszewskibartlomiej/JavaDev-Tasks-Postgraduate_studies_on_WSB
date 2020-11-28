import devices.Device;
import ja.task0.Animal;
import ja.task0.Human;
import ja.task0.Phone;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal("Saba", "German Shepherd", 45.8, 7);

        Human human = new Human("Bartek", "Janiszewski", 42, 111.1, 176, "white");

        Phone phone = new Phone("Huawei", "e20 lite", 5.9, 6827364873236286428L, "blue");

        Device device = new Device("Chrysler", "Voyager", 2008);

        System.out.println(device);
    }


}
