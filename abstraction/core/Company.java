package abstraction.core;

public class Company {
    public static void main(String[] args) {
        Employee emp = new FullTimeEmployee("Karan",231,"IT","SDE");
        Employee emp2 = new PartTimeEmployee("Shreya",234,"IT","Web Developer","MMHAPU");
        emp.employeeRole();
        emp.employeeDetail();
        System.out.println("_________________________________________");
        emp2.employeeRole();
        emp2.employeeDetail();
    }
}
