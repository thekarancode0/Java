package interfaces.core;

public class Main {
    public static void main(String[] args) {
        Vehicle bike = new Bike();
        bike.changeGear(4);
        bike.speedUp(60);
        bike.applyBrakes(10);
        System.out.println("-----------------");
        Vehicle car = new Car();
        car.displayInfo();
        VehicleRules.rules();
    }
}
