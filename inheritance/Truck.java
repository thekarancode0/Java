package inheritance;

public class Truck extends Vehicle {
    private double loadCapacity;
    private boolean hasTrailer;

    public Truck(String make, String model, int year, Owner owner, double loadCapacity, boolean hasTrailer){
        super(make,model,year,owner);
        this.loadCapacity = loadCapacity;
        this.hasTrailer = hasTrailer;
    }

    @Override
    public void showDetail(){
        super.showDetail();
        System.out.println("Load Capacity: " + loadCapacity + " tons");
        System.out.println("Has Trailer: " + (hasTrailer ? "Yes" : "No"));
    }

    public void sample(){
        System.out.println("sample");
    }
}
