package storebæltsbroen;

import java.util.HashMap;

public class Main {
  public static void main(String[] args) {
    Car car1 = new Car("1234", "yellow", 2, 2);
    Car car2 = new Car("4567", "blue", 2, 2);
    HashMap<String, Car> cars = new HashMap<>();
    cars.put(car1.getNumberPlate(), car1);
    cars.put(car2.getNumberPlate(), car2);

    Storebæltsbroen storebæltsbroen = new Storebæltsbroen(cars);

    System.out.println(storebæltsbroen.getCars("1234"));
  }
}
