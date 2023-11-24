import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Honda", "CR-V", 2023, "Red", 50000, 45));
        cars.add(new Car("Ford", "F-150", 2020, "Black", 25000, 30));
        cars.add(new Car("BMW", "X5", 2022, "Green", 60000, 65));
        cars.add(new Car("Mazda", "CX-5", 2019, "White", 15000, 60));
        cars.add(new Car("Audi", "Q7", 2018, "Silver", 52000, 47));
        cars.add(new Car("Kia", "Forte", 2020, "Blue", 21000, 56));

        for (Car car : cars) {
            car.honk();
        }

        for (int i = 0; i < 7; i++) {
            for (Car car : cars) {
                int year = car.getYear();
                if (year < 2023) {
                    int updatedGas = car.getGas() - (5 + (2023 - year));
                    car.setGas(updatedGas);
                } else {
                    car.setGas(car.getGas() - 5);
                }
            }
        }

        for (Car car : cars) {
            System.out.println(car.getBrand() + "( " + car.getModel() + " ) Remaining Gas:" + car.getGas());
        }
    }
}