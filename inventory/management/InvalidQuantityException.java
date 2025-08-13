package inventory.management;

public class InvalidQuantityException extends Exception{
    public InvalidQuantityException(String message){
        super(message);
    }
}
