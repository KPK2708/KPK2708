abstract class PaymentMethod {
    public abstract void processPayment(double amount);
}

class CreditCard extends PaymentMethod {
    @Override
    public void processPayment(double amount) {
        double fee = amount * 0.02;
        System.out.println("Processing credit card payment of $" + amount + " with a fee of $" + fee);
    }
}

class PayPal extends PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount + " with no additional fee.");
    }
}

public class OnlinePaymentSystem {
    public static void processTransaction(PaymentMethod paymentMethod, double amount) {
        paymentMethod.processPayment(amount);
    }

    public static void main(String[] args) {
        PaymentMethod creditCard = new CreditCard();
        PaymentMethod payPal = new PayPal();
        
        processTransaction(creditCard, 100.00);
        processTransaction(payPal, 100.00);
    }
}
