public class BankAccount extends Bank{

    private String customerName;
    private String emailAddress;
    private String phoneNumber;
    private String password = "_*sx2Dx";
    private float balance = 0;

    public BankAccount(String customerName, String emailAddress, String phoneNumber, float balance, Bank bank) {
        super(bank.bankName, bank.address);
        this.customerName = customerName;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
        this.balance = balance;
    }

    public float getBalance() {
        return balance;
    }

    public boolean deposit(float amount, String password) {
        if (amount > 0 && this.password.equals(password)) {
            this.balance += amount;
            return true;
        }
        return false;
    }

    public boolean withdraw(float amount, String password) {
        if (amount <= this.balance) {
             if (amount <= this.withdrawalLimit) {
                 if (this.password.equals(password)) {
                     this.balance = this.balance - amount;
                     return true;
                 }
             }
        }
        return false;
    }

}
