package creatures;

import devices.Phone;
import homework.task1.Animal;
import homework.task2.Car;

import java.util.Calendar;

public class Human {
    public String firstName;
    public Integer height;
    public String skinColor;
    public Animal pet;
    protected String lastName;
    protected Integer age;
    protected Double weight;
    private Car car;
    private Integer salary;
    public Phone phone;
    private Double cash;


    public Human(String firstName, String lastName, Integer age, Double weight, Integer height, String skinColor) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.skinColor = skinColor;
        this.cash = 0.0;
        this.salary = 0;
    }

    public Car getCar() {
        return this.car;
    }

    public void setCar(Car car) {
        if (this.salary > car.value) {
            System.out.println("Udało się kupić samochód za gotwkę");
            this.car = car;
        } else if (this.salary > (car.value / 12)) {
            System.out.println("Udał ci się kupić samochód na kredyt");
            this.car = car;
        } else {
            System.out.println("Zaisz się na studia i znajdz nową pracę ");
        }
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

    public Integer getSalary() {
        Calendar cal = Calendar.getInstance();
        System.out.println("\n" + cal.getTime());
        System.out.println(salary);
        return salary;
    }

    public void setSalary(Integer salary) {
        if (salary > 0) {
            System.out.println("\nNowe dane zostały wysłane do systemu księgowego");
            System.out.println("Prosimy odebrać ankes od Pani Hani z kadr");
            System.out.println("ZUS i US zostały poinformowane o aneksie");
        } else {
            System.out.println("\nPodałeś wartośc ujemną :(");
        }
        this.salary = salary;
    }

    public Double getCash() {
        return cash;
    }

    public void setCash(Double cash) {
        if (cash != null) {
            this.cash = cash;
        } else {
            System.out.println("Nie mozesz przypisac ujemnej wartosci");
        }
    }
}
