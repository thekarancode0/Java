package inheritance;

public class Owner {
    private String name;
    private String licenceNumber;

    public Owner(String name, String licenceNumber){
        this.name = name;
        this.licenceNumber = licenceNumber;
    }

    public void displayOwnerInfo(){
        System.out.println("Owner Name: " + name);
        System.out.println("Licence number: " + licenceNumber);
    }

}
