public class ICICIBankAdapter implements BankApi {
    ICICIBankApi iciciBankApi = new ICICIBankApi();

    @Override
    public int checkBalance() {
        return iciciBankApi.checkBalance();
    }

    @Override
    public void transferMoney(int money) {
        iciciBankApi.transferMoney(money);
    }
}
