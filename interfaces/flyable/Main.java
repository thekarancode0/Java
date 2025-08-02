package interfaces.flyable;

public class Main {
    public static void main(String[] args) {
        Bird eagle = new Eagle("Eagle",0.25);
        System.out.println(eagle.getName());
        System.out.println(eagle.getWingspan());
        eagle.land();
        eagle.fly();
    }
}
