public class carClass {
   static class Car{
        String make;
        String model;
        int year;

        Car(String make, String model, int year){
            this.make = make;
            this.model = model;
            this.year  = year;
        }

        void displayInfo(){
            System.out.println("Car Make: " + make);
            System.out.println("Car Model: " + model);
            System.out.println("Manufacturing  year: " + year);
        }
    }

    public static void main(String[] args) {
        Car c1 = new Car("Toyata","Camry",2020);
        c1.displayInfo();
    }
}
