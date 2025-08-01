package hospital.management;

public class Nurse extends HospitalMember{
    public Nurse(String name, int id){
        super(name,id);
    }

    @Override
    void performDuties(){
        System.out.println("Nurse " + name + " is monitoring patient vitals");
    }
    public void assistDoctor(){
        System.out.println("Nurse " + name + " is assisting the doctor.");
    }
}
