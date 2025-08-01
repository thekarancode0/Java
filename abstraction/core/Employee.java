package abstraction.core;

abstract class Employee {
    String name;
    int id;
    String department;

    Employee(String name, int id, String department){
        this.name = name;
        this.id = id;
        this.department = department;
    }

    abstract void employeeRole();
    abstract void employeeDetail();
}
