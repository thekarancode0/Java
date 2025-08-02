package inheritance;

public class Main {
    public static void main(String[] args) {
        Owner owner = new Owner("karan","1223-HGY98");
        Vehicle bike = new Bike("Yamaha","R15",2022,owner,"sports");
        bike.showDetail();

        Owner owner1 = new Owner("Ankit","1222-DED89");
        Vehicle car = new Car("Tesla","mode-3",2022,owner1,false,"Petrol",4);
        car.showDetail();

        Owner owner2 = new Owner("Aayan","1214-TJI78");
        Vehicle truck = new Truck("Tata","Heavy Duty",2025,owner2,10.5,true);
        truck.showDetail();
//        ((Truck)truck).sample();   You can access Bike-specific methods by downcasting:
    }
}
