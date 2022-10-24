package storebæltsbroen;

public class Car {
  private String numberPlate;
  private String color;
  private int numberOfPassengers;
  private int length;

  public Car(String numberPlate, String color, int numberOfPassengers, int length) {
    this.numberPlate = numberPlate;
    this.color = color;
    this.numberOfPassengers = numberOfPassengers;
    this.length = length;
  }

  public String getNumberPlate() {
    return numberPlate;
  }

  public String getColor() {
    return color;
  }

  public int getNumberOfPassengers() {
    return numberOfPassengers;
  }

  public int getLength() {
    return length;
  }

  @Override
  public String toString() {
    return "numberPlate='" + numberPlate + '\'' +
        ", color='" + color + '\'' +
        ", numberOfPassengers=" + numberOfPassengers +
        ", length=" + length;
  }
}
