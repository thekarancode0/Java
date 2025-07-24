class Student2{
    String name;
    int id;
    Student2(String name, int id){
        this.name = name;
        this.id = id;
    }
    void detail(){
        System.out.println("Name: " + name + " || Id: " + id);
    }

}
public class constructor {
    public static void main(String[] args) {
        Student2 s = new Student2("Karan",874);
        s.detail();
    }
}
