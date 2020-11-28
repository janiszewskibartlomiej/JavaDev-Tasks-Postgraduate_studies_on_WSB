package devices;

public class Phone extends Device {
    public String producer;
    public String model;
    public Double screenSize;
    public String color;
    protected Long producerNumber;

    public Phone(String producer, String model, Double screenSize, Long producerNumber, String color, Integer yearOfProduction) {
        super(producer, model, yearOfProduction);
        this.producer = producer;
        this.model = model;
        this.screenSize = screenSize;
        this.producerNumber = producerNumber;
        this.color = color;
    }
}
