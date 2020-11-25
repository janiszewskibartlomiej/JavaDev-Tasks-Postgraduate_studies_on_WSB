package ja.task1;

public class Main {
    public static void main(String[] arg) {

        Human human = new Human("Bartek", "Janiszewski", 42, 111.1, 176, "withe");

        Animal horse = new Animal("Mustang", "koń", 12);

        System.out.println(human.firstName + " " + human.lastName + " " + "have " + human.age + " years old.\n");

        System.out.println(horse.name + " " + horse.age + " years old, " + "weight = " + horse.getWeight() + "\n");

        horse.feed();
        horse.feed();
        horse.feed();
        horse.feed();

        System.out.println(horse.name + " " + horse.age + " years old, " + "weight = " + horse.getWeight() + "\n");

        for (int i = 0; i < 304; i++) {
            horse.takeForWalk();
        }

        System.out.println(horse.name + " " + horse.age + " years old, " + "weight = " + horse.getWeight() + "\n");

        horse.takeForWalk();
    }
}
