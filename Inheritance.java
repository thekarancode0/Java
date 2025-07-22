public class Inheritance {
   static class Person{
        String name;
        int age;
        String address;

        void displayDetails(){
            System.out.println("Name: " + name + " | Age: " + age + " | Address: " + address);
        }
    }

    static class Student extends Person{
        int rollNumber;
        String course;
        int[] marks = new int[5];

//       constructor
        Student(String name,int age, String address, int roll, String course, int m1, int m2, int m3){
            this.name = name;
            this.age = age;
            this.address = address;
            this.rollNumber = roll;
            this.course = course;
            this.marks[0] = m1;
            this.marks[1] = m2;
            this.marks[2] = m3;
        }

        int calculateAverage(){
            return (marks[0]+marks[1]+marks[2]) / 3;
        }

        void displayDetails(){
            System.out.println("-------Student Detail-------");
            System.out.println("Roll: " + rollNumber + " | Course: " + course);
            System.out.println("Name: " + name + " | Age: " + age + " | Address: " + address);
            System.out.println("Marks: " + marks[0] + " | " + marks[1] + " | " + marks[2]);
            System.out.println("\n");
        }
    }

    static  class Teacher extends  Person{
       int employeeId;
       String department;
       int salary;

        Teacher(String name,int age, String address, int employeeId, String department, int salary){
            this.name = name;
            this.age = age;
            this.address = address;
            this.employeeId = employeeId;
            this.department = department;
            this.salary = salary;
        }

        int calculateAnnualSalary(){
            return salary*12;
        }

        void displayDetails(){
            System.out.println("-------Teacher Detail-------");
            System.out.println("employeeId: " + employeeId + " | department: " + department);
            System.out.println("Name: " + name + " | Age: " + age + " | Address: " + address);
            System.out.println("salary: " + salary);
            System.out.println("\n");
        }


    }

    public static void main(String[] args) {
        Student s1 = new Student("karan",21,"Gopalganj",12,"BCA",90,90,80);
        s1.displayDetails();
        Student s2 = new Student("Ankit",22,"Siwan",15,"BCA",99,40,70);
        s2.displayDetails();

        Teacher t1 = new Teacher("Gyan Ranjan",45,"Gopalganj",123,"BCA",90000);
        Teacher t2 = new Teacher("Golu Jii",24,"London",144,"Maths",70000);
        t1.displayDetails();
        t2.displayDetails();

        System.out.println("\n-----Max Average Marks-----");
        int avg1 = s1.calculateAverage();
        int avg2 = s2.calculateAverage();

        if(avg1 > avg2){
            System.out.println(s1.name + " getting the highest average marks");
        }else {
            System.out.println(s2.name + " getting the highest average marks");
        }

        System.out.println("\n");
        System.out.println("Annual Salary of " + t1.name + " : " + t1.calculateAnnualSalary());
        System.out.println("Annual Salary of " + t2.name + " : " + t1.calculateAnnualSalary());
    }
}
