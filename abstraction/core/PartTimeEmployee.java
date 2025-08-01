package abstraction.core;

public class PartTimeEmployee extends Employee{
    String role;
    String college;

    public PartTimeEmployee(String name, int id, String department, String role, String college){
        super(name,id,department);
        this.role = role;
        this.college = college;
    }

    @Override
    public void employeeRole(){
        System.out.println(name + "(ID: " + id + " ) is working in department: " + department +" as " + role);
    }

    @Override
    public void employeeDetail(){
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Role: " + role);
        System.out.println("Department: " + department);
        System.out.println("Part Time Employee");
    }
}
