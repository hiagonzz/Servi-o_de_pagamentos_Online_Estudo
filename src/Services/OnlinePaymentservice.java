package Services;

public interface OnlinePaymentservice {
    public double PaymentFee(double amount);
    public double  interest(double amount , Integer months);
}
