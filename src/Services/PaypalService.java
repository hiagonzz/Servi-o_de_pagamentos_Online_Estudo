package Services;

public class PaypalService implements OnlinePaymentservice {

    @Override
    public double PaymentFee(double amount) {
        return amount * 0.02;
    }

    @Override
    public double interest(double amount, Integer months) {
        return amount * 0.01 * months;
    }

}