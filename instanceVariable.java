public class instanceVariable {

    //instance
    String name;
    String pos;
    public void display(){
        System.out.println("Name: " + name);
        System.out.println("Position: " + pos);
    }

    public static void main(String[] args) {
        //Object 1 has its own copy
        instanceVariable person1 = new instanceVariable();
        person1.name = "karan";
        person1.pos  = "SDE";
        person1.display();

        //Object 2 has its own copy
        instanceVariable person2 = new instanceVariable();
        person2.name = "Shreya";
        person2.pos = "SDE";
        person2.display();

    }
}
