package interfaces.core;

interface Vehicle {

  void changeGear(int a);
    void speedUp(int a);
    void applyBrakes(int a);

    default void displayInfo(){
        System.out.println("An indian Car");
    }

}
