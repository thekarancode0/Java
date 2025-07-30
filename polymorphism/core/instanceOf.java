package polymorphism.core;


class Payment{
    void makePayment(double amount){
        System.out.println("Making a generic payment of ₹" + amount);
    }

    void commonPolicy(){
        System.out.println("All payments are subject to standard transaction fees.");
    }
}

//---------------------------------------------------------------------------------------------------------------------

class CreditCard extends Payment{
    @Override
    void makePayment(double amount){
        System.out.println("Processing ₹" + amount + " via Credit Card.");
    }

    void checkCreditCardLimit(){
        System.out.println("Checking credit limit for Credit Card.");
    }
}

//---------------------------------------------------------------------------------------------------------------------

class UPIPayment extends Payment{
    @Override
    void makePayment(double amount){
        System.out.println("Processing ₹" + amount + " via UPI.");
    }

    void validateUPIId(){
        System.out.println("Validating UPI ID before payment");
    }
}

//---------------------------------------------------------------------------------------------------------------------

class PayPal extends Payment{
    @Override
    void makePayment(double amount){
        System.out.println("Processing ₹" + amount + " via PayPal");
    }

    void loginToPayPal(){
        System.out.println("Logging into PayPal account.");
    }
}

//---------------------------------------------------------------------------------------------------------------------

public class instanceOf {
    public static void main(String[] args) {
        //upcasting
        Payment p1 = new CreditCard();
        p1.makePayment(10000);
        p1.commonPolicy();
        //p1.checkCreditCardLimit(); cannot access child method using child object with parent reference.

        if(p1 instanceof CreditCard){
            CreditCard c = (CreditCard)p1;
            c.checkCreditCardLimit();
        }

        PayPal pp = new PayPal();
        pp.loginToPayPal();
        pp.makePayment(10000);

    }
}
