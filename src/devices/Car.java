package devices;

public class Car extends Device implements Saleable {

    public String color;
    public Double capacity;
    public String engine;
    public Integer passengers;
    public String type; // like van, suv ...
    public Integer value;


    public Car(String producer, String model, Integer value, Integer yearOfProduction) {
        super(producer, model, yearOfProduction);
        this.value = value;
    }

    public Car(String producer, String model, String color, Double capacity, String engine, Integer passengers, String type, Integer value, Integer yearOfProduction) {
        super(producer, model, yearOfProduction);
        this.color = color;
        this.capacity = capacity;
        this.engine = engine;
        this.passengers = passengers;
        this.type = type;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Car{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", capacity=" + capacity +
                ", engine='" + engine + '\'' +
                ", passengers=" + passengers +
                ", type='" + type + '\'' +
                '}';
    }

    @Override
    public void turnOn() {

    }

    @Override
    public void sell() {

    }

    @Override
    public void sellOnCredit() {

    }
}
