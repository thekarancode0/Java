package inheritance;

public class Bike extends Vehicle {
    private String type;

    public Bike(String make, String model, int year, Owner owner, String type) {
        super(make, model, year, owner);
        this.type = type;
    }

//    public void showDetail(){
//        System.out.println("Bike Type: " + type);
//        super.showDetail();
//    }
}
