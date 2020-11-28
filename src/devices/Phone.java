package devices;

public class Phone extends Device {
    public final Double screenSize;
    public String color;
    protected Long producerNumber;

    public Phone(String producer, String model, Integer yearOfProduction, Double screenSize, Long producerNumber, String color) {
        super(producer, model, yearOfProduction);
        this.screenSize = screenSize;
        this.producerNumber = producerNumber;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "screenSize=" + screenSize +
                ", color='" + color + '\'' +
                ", producerNumber=" + producerNumber +
                ", producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }

    @Override
    public void turnOn() {

    }
}
