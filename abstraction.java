abstract class Payment{
    abstract void makePayment();
    void paymentDetail(){
        System.out.println("Payment initiated...");
    }
}

class UpiPayment extends Payment{
    @Override
    void makePayment(){
        System.out.println("Payment done using UPI.");
    }
}

class CardPayment extends Payment{
    @Override
    void makePayment(){
        System.out.println("Payment done using card.");
    }
}

public class abstraction {
    public static void main(String[] args) {
        Payment p1 = new UpiPayment();
        p1.paymentDetail();
        p1.makePayment();
        System.out.println("---------------");
        Payment p2 = new CardPayment();
        p2.paymentDetail();
        p2.makePayment();
    }
}
