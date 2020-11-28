package devices;

import creatures.Human;

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
        System.out.println("Uruchomiłem silnik samochodu");
    }


    @Override
    public void sell(Human seller, Human buyer, Double price) throws Exception {
        if (seller.getCash() == null || buyer.getCash() == null) {
            throw new Exception("Musisz zdefinowac stan portfela");
        }

        if (seller.getCar() == null) {
            System.out.println("Sorry nie mas samochodu");
            throw new Exception("Brak samochodu");
        }
        if (buyer.getCash() < price) {
            System.out.println("Sory nie masz kasy");
            throw new Exception("Brak kasy");
        }
        buyer.setCash(buyer.getCash() - price);
        seller.setCash(seller.getCash() + price);
        buyer.setCar(seller.getCar());
        seller.setCar(null);
        System.out.println("Samochód  sprzedano za " + price + " od " + seller.firstName + " do " + buyer.firstName);

    }
}
