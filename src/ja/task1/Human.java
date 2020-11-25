package ja.task1;

public class Human {
    public String firstName;
    public Integer height;
    public String skinColor;
    public Animal pet;
    protected String lastName;
    protected Integer age;
    protected Double weight;


    public Human(String firstName, String lastName, Integer age, Double weight, Integer height, String skinColor) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.skinColor = skinColor;
    }
}
