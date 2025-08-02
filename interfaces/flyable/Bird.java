package interfaces.flyable;

public class Bird implements Flyable{

    private String name;
    private double wingspan;
    private boolean isFlying;

    public Bird(String name, double wingspan){
        this.name = name;
        this.wingspan = wingspan;
        this.isFlying = false;
    }

    public String getName(){
        return name;
    }

    public double getWingspan(){
        return wingspan;
    }

    public boolean isFlying(){
        return isFlying;
    }

    @Override
    public void fly(){
        if(!isFlying){
            isFlying = true;
            System.out.println(name + " is flying with a wingspan of " + wingspan + " meters.");
        }else{
            System.out.println(name + " is already in the air.");
        }
    }

    @Override
    public void land(){
       if(isFlying){
           isFlying = false;
           System.out.println(name + " has landed safely.");
       }else{
           System.out.println(name + " is already on the ground");
       }
    }
}
