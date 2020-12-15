public class Vehicle {
    public double calculateValue() {...}
}
public class Car extends Vehicle {
    public double calculateValue() {
        return this.getValue() * 0.8;}
}
public class Truck extends Vehicle {
    public double calculateValue() {
        return this.getValue() * 0.9;}
}