package abstraction.core;

public class FullTimeEmployee extends Employee{
    String role;
    public FullTimeEmployee(String name, int id, String department, String role){
        super(name,id,department);
        this.role = role;
    }

    @Override
    public void employeeRole(){
        System.out.println(name + "(ID: " + id + " ) is working in Department: " + department + " as " + role);
    }

    @Override
    public void employeeDetail(){
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Role: " + role);
        System.out.println("Department: " + department);
        System.out.println("Full Time Employee");
    }
}
