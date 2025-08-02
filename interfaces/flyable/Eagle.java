package interfaces.flyable;

public class Eagle extends Bird{
    public Eagle(String name, double wingspan){
        super(name,wingspan);
    }

    @Override
    public void fly(){
        System.out.println(getName() + " the eagle is soars high above the mountains.");
        super.fly();
    }

    @Override
    public  void land(){
        System.out.println(getName() + " the eagle is landing with sharp precision.");
        super.land();
    }
}
