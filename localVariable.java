public class localVariable {
    public static void greeting(){
        String greet = "Hello ji...";
        System.out.println(greet);
    }
    public static void main(String[] args) {
        greeting();
//        System.out.println(greet);   Cannot access local variable outside its scope
        String name = "Karan Kumar";
        System.out.println("My name is : " + name);
    }
}
