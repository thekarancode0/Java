package hospital.management;

public class Patient extends HospitalMember{
    String disease;

    public Patient(String name, int id, String disease){
        super(name,id);
        this.disease = disease;
    }

    @Override
    void performDuties(){
        System.out.println("Patient " + name + " is receiving treatment for " + disease + "." );
    }

    public  void takeMedicine(){
        System.out.println("Patient " + name + " is taking medicine.");
    }
}
