public class Main {

    public static void main(String[] args) {

        Bank ziraatBank = new Bank("Ziraat Bankası", "Atalar, Üsküdar Cd. No:81, 34862 Kartal/İstanbul");

        BankAccount bankAccount = new BankAccount("Ömer Faruk Küçük", "kucukomerf@gmail.com", "+905343323034", 0, ziraatBank);

        bankAccount.deposit(100, "_*sx2Dx");

        bankAccount.withdraw(100, "_*sx2Dx");

    }

}
