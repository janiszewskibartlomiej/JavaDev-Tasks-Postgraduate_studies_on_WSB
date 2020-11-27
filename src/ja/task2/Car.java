package ja.task2;

public class Car {
    final String producer;
    final String model;
    public String color;
    public Double capacity;
    public String engine;
    public Integer passengers;
    public String type; // like van, suv ...
    public Integer value;

    public Car(String producer, String model) {
        this.producer = producer;
        this.model = model;
    }

    public Car(String producer, String model, Integer value) {
        this.producer = producer;
        this.model = model;
        this.value = value;
    }

    public Car(String producer, String model, String color, Double capacity, String engine, Integer passengers, String type, Integer value) {
        this.producer = producer;
        this.model = model;
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

}
