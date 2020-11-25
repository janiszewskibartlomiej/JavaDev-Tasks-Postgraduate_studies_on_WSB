package ja.task2;

import ja.task1.Animal;

public class Human {
    public String firstName;
    public Integer height;
    public String skinColor;
    public Animal pet;
    protected String lastName;
    protected Integer age;
    protected Double weight;
    public Object car;

    public Human(String firstName, String lastName, Integer age, Double weight, Integer height, String skinColor) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.skinColor = skinColor;
    }

    @Override
    public String toString() {
        return "Human{" +
                "firstName='" + firstName + '\'' +
                ", height=" + height +
                ", skinColor='" + skinColor + '\'' +
                ", pet=" + pet +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", car=" + car +
                '}';
    }
}
