public class ICICIBankApi {
    int transferAmount = 0;

    public int checkBalance() {
        return 100;
    }

    public void transferMoney(int amount) {
        setTransferAmount(amount);
        System.out.println("Transferred " + amount + " via ICICI Bank.");
    }

    public void setTransferAmount(int amount) {
        transferAmount = amount;
    }
}
