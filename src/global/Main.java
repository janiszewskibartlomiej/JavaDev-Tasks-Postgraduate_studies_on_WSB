package global;

import javaTask0.Animal;
import javaTask0.Human;
import javaTask0.Phone;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal("Saba", "German Shepherd", 45.8, 7);

        Human human = new Human("Bartek", "Janiszewski", 42, 111.1, 176, "white");

        Phone phone = new Phone("Huawei", "e20 lite", 5.9, 6827364873236286428L, "blue");

        System.out.println(animal.name);
        System.out.println(human.firstName);
        System.out.println(phone.producer);
    }


}
