public class WaterBank implements Bank{
    private int accountNo;
    private int amount;

    public WaterBank(int accountNo, int amount) {
        this.accountNo = accountNo;
        this.amount = amount;
    }

    @Override
    public String paymentMethod() {
        return "Your payment will be " + (amount * amount)+" USD";
    }
}

