package inheritance;

public class Car extends Vehicle {
    private boolean isElectric;
    private String fuelType;
    private int numDoors;

    public Car(String make, String model, int year, Owner owner, boolean isElectric, String fuelType, int numDoors){
        super(make,model,year,owner);
        this.fuelType = fuelType;
        this.numDoors = numDoors;
        this.isElectric = isElectric;
    }

    @Override
    public void showDetail(){
        super.showDetail();
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Number of Doors: " + numDoors);
        System.out.println("Electric: " + (isElectric ? "Yes" : "No"));;
    }

}
