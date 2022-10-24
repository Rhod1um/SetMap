package storebæltsbroen;

import java.util.Map;

public class Storebæltsbroen {
  Map<String, Car> cars;

  Storebæltsbroen(Map<String, Car> cars){
    this.cars = cars;
  }

  public Car getCars (String numberPlate){
    return cars.get(numberPlate);
  }
}
