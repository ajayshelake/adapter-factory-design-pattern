public class PhonePe {
    private final BankApi bankApi;

    public PhonePe(BankApi bankApi) {
        this.bankApi = bankApi;
    }

    public int checkBalance() {
        return bankApi.checkBalance();
    }

    public void transferMoney(int amount) {
        bankApi.transferMoney(amount);
    }
}
