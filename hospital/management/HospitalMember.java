package hospital.management;

abstract class HospitalMember {
    String name;
    int id;

    public HospitalMember(String name, int id){
        this.name = name;
        this.id = id;
    }
    public void attendMeeting(){
        System.out.println(name + " (ID: " + id + ") is attending a hospital meeting.");
    }

    abstract void performDuties();
}
