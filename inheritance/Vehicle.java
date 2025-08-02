package inheritance;

public class Vehicle {
    protected String model;
    protected  int year;
    protected String make;
    protected Owner owner;

    public Vehicle(String make, String model, int year, Owner owner) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.owner = owner;
        System.out.println("______________________________");
    }

    public void showDetail(){
        System.out.println("Model: " + model);
        System.out.println("Make: " + make);
        System.out.println("Year: " + year);

        owner.displayOwnerInfo();


    }
}
