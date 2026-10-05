public class YesBankApiAdapter implements BankApi{
    YesBankAPI yesBankAPI = new YesBankAPI();
    @Override
    public int checkBalance() {
        return yesBankAPI.getBalance();
    }

    @Override
    public void transferMoney(int money) {
        yesBankAPI.moneyTransfer();
    }
}
