package hospital.management;

public class HospitalManagement {
    public static void main(String[] args) {

        //Creating Hospital members
        Doctor doc  = new Doctor("Karan",101,"Cardiology");
        Nurse nurse = new Nurse("Rupa",102);
        Patient patient = new Patient("Ravi",201,"Flue");
        Receptionist reception = new Receptionist("Meena",402);

        HospitalMember[] members = {doc,nurse,patient,reception};
        for(HospitalMember member : members){
            member.performDuties();
            member.attendMeeting();
            System.out.println("----------------------");
        }

        doc.prescribeMedicine();
        nurse.assistDoctor();
        patient.takeMedicine();
        reception.manageVisitors();

    }
}
