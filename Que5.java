package PrePlacementTraning.JavapptAssign3;
//Q5. Achieve loose coupling in java by using OOPs  concept?

// Interface defining the contract for a payment method
interface PaymentMethod {
    void pay(double amount);
}

// Concrete class implementing the PaymentMethod interface
class CreditCardPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Paying $" + amount + " with a credit card.");
        // Additional credit card payment logic
    }
}

// Another concrete class implementing the PaymentMethod interface
class PayPalPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Paying $" + amount + " with PayPal.");
        // Additional PayPal payment logic
    }
}

// Class that utilizes the PaymentMethod interface without directly depending on specific implementations
class ShoppingCart {
    private PaymentMethod paymentMethod;

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void checkout(double amount) {
        System.out.println("Checking out with a total amount of $" + amount);
        paymentMethod.pay(amount);
    }
}

public class Que5 {
    public static void main(String[] args) {
        // Create a shopping cart
        ShoppingCart cart = new ShoppingCart();

        // Set the payment method dynamically based on user choice or configuration
        PaymentMethod paymentMethod = new CreditCardPayment();
        cart.setPaymentMethod(paymentMethod);

        // Checkout with the chosen payment method
        cart.checkout(100.50);
    }
}

