/* Abstraction means hiding internal implementation details and exposing only essential functionality. 
The user only knows what action can be performed, not how it is implemented internally. */

/* For example, while using Google Pay, the user only clicks “Pay ₹1000”. The user is not concerned with how the bank communication, encryption, authentication, or transaction processing happens internally. 
Similarly, while riding a scooty, the rider only uses the controls and is not concerned with the internal engine mechanism. This concept is called abstraction. */


//Abstraction class
abstract class Payment {

    //Non-abstract method
    void printInvoice(){
        System.out.println("Invoice printed");
    }

    // Abstract method
    abstract void pay(double amount);
}

// Implementation class 1
class UpiPayment extends Payment {

    @Override
    void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using UPI");
    }
}

// Implementation class 2
class CardPayment extends Payment {

    @Override
    void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Credit Card");
    }
}

public class Main {

    public static void main(String[] args) {

        // User only knows pay() method
        //Reference of Payment class is payment
        Payment payment;

        payment = new UpiPayment();
        payment.pay(1000);

        payment = new CardPayment();
        payment.pay(2000);
    }
}

//Abstraction Interface
interface Payment {

    // Interface method (only declaration)
    void pay(double amount);

    default void payreceipt(){
        System.out.println("Here is your payment receipt");
    }

    static void fail(){
        System.out.println("There is a server error");
    }
}


// First implementation class
class UpiPayment implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using UPI");
    }

    //hidden method
    static void fail(){
        System.out.println("No failure!!!");
    }
}


// Second implementation class
class CardPayment implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Credit Card");
    }
}


// Main class
public class Main {

    public static void main(String[] args) {

        // Interface reference
        Payment payment;

        // UPI payment object
        payment = new UpiPayment();
        payment.pay(1000);

        // Card payment object
        payment = new CardPayment();
        payment.pay(2000);
    }
}