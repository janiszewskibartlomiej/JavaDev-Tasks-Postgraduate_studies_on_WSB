package devices;

import creatures.Human;

public class Phone extends Device implements Saleable {
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
        System.out.println("Telefin został włączony");
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) throws Exception {
        if (seller.getCash() == null || buyer.getCash() == null) {
            throw new Exception("Musisz zdefinowac stan portfela");
        }

        if (seller.phone == null) {
            System.out.println("Sorry nie mas ztelefonu");
            throw new Exception("Brak teelfonu");
        }
        if (buyer.getCash() < price) {
            System.out.println("Sory nie masz kasy");
            throw new Exception("Brak kasy");
        }
        buyer.setCash(buyer.getCash() - price);
        seller.setCash(seller.getCash() + price);
        buyer.phone = seller.phone;
        seller.phone = null;
        System.out.println("Telefon sprzedano za " + price + " od " + seller.firstName + " do " + buyer.firstName);
    }
}
