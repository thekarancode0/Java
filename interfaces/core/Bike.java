package interfaces.core;

public class Bike implements Vehicle{
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
    public void applyBrakes(int newBrakes){
        speed -= newBrakes;
    }

    public void printState(){
        System.out.println("Speed: " + speed + " Gear: " + gear);
    }
}
