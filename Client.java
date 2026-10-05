import java.util.Scanner;

public class Client {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        String bankName = scn.nextLine();
        BankApi bankApi = BankAPIFactory.getBankAPI(bankName);
        PhonePe phonePe = new PhonePe(bankApi);

        System.out.println("Balance: " + phonePe.checkBalance());
        phonePe.transferMoney(50);

        scn.close();
    }
}
