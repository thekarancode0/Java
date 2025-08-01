package hospital.management;

public class Receptionist extends HospitalMember{
    public Receptionist(String name, int id){
        super(name,id);
    }

    @Override
    void performDuties(){
        System.out.println("Receptionist " + name + " is scheduling appointments.");
    }

    public void manageVisitors(){
        System.out.println("Receptionist " + name + " is managing visitor entries.");
    }

}
