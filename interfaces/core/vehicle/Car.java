package interfaces.core;

public class Car implements Vehicle,VehicleRules{
    int speed;
    int gear;

    @Override
    public void changeGear(int newGear){
        gear = newGear;
    }

    @Override
    public void speedUp(int newSpeed){
        speed += newSpeed;
    }

    @Override
    public void applyBrakes(int newBrake){
        speed -= newBrake;
    }

    public void printState(){
        System.out.println("Speed: " + speed + " Gear: " + gear);
    }
}
