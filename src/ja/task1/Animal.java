package ja.task1;

public class Animal {
    final String species;
    public String name;
    protected Integer age;
    private Double weight;

    public Animal(String name, String species, Integer age) {
        this.name = name;
        this.species = species;
        this.age = age;

        switch (species) {
            case "pies":
                this.weight = 20.0;
                break;
            case "kot":
                this.weight = 5.0;
                break;
            case "koń":
                this.weight = 300.0;
                break;
            case "rekin":
                this.weight = 600.0;
            default:
                this.weight = 50.0;

        }

    }

    public Double getWeight() {
        return weight;
    }

    void feed() {
        this.weight++;
    }

    void takeForWalk() {
        this.weight--;
        if (this.weight <= 0) {
            System.out.println(this.name + " nie żyje !!!");
        } else {
            System.out.println(this.name + " Został wyprowadzony na spacer, a jego obecna waga to " + this.weight);
        }
    }
}
