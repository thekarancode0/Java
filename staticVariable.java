public class staticVariable {
    //instance Variable
    String name;
    //Static variable
    static String college = "Silicon Academy";

    staticVariable(String name){
        this.name = name;
    }
    public void display(){
        System.out.println("Name: " + name);
        System.out.println("College: " + college);
        System.out.println("____________________________");
    }

    public static void main(String []args){
        staticVariable student1 = new staticVariable("Karan");
        staticVariable student2 = new staticVariable("Kayank");

        System.out.println(staticVariable.college);
        student1.display();
        student2.display();
    }
}
