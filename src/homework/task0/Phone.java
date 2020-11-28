package homework.task0;

public class Phone {
    public String producer;
    public String model;
    public Double screenSize;
    protected Long producerNumber;
    public String color;

    public Phone(String producer, String model, Double screenSize, Long producerNumber, String color) {
        this.producer = producer;
        this.model = model;
        this.screenSize = screenSize;
        this.producerNumber = producerNumber;
        this.color = color;
    }
}
