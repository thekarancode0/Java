package hospital.management;

public class Doctor extends HospitalMember{
    String specialization;
    public Doctor(String name, int id, String specialization){
        super(name,id);
        this.specialization = specialization;
    }

    @Override
    void performDuties(){
        System.out.println("Dr. " + name + " is treating patients in " + specialization + ".");
    }

    public void prescribeMedicine(){
        System.out.println("Dr. " + name + " is prescribing medicine.");
    }

}
