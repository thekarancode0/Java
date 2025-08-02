package interfaces.core;

interface VehicleRules {
    int MAX_SPEED = 120;
    String seatBelt = "required";
    int minAge = 20;

    static void rules(){
        System.out.println("Max Speed: " + MAX_SPEED);
        System.out.println("Seat Beat: " + seatBelt);
        System.out.println("Min age to drive: " + minAge);
    }
}
