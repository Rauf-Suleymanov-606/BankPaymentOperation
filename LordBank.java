public class LordBank implements Bank {
    private int accountNo;
    private int amount;

    public LordBank(int accountNo, int amount) {
        this.accountNo = accountNo;
        this.amount = amount;
    }

    @Override
    public String paymentMethod() {
        return "Your payment will be " + (amount * 80 / 100)+" USD";
    }
}
