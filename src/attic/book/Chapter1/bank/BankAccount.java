package attic.book.Chapter1.bank;

public class BankAccount {

    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {//к-во
        balance = balance + amount;
    }

    public void withdraw(double amount) {
        balance = balance - amount;
    }

    public void display(){
        System.out.println("balance= "+balance);
    }
}
class BankApp
{
    public static void main(String[] args)
    {
        BankAccount ba1 = new BankAccount(100.00); // Создание счета
        System.out.print("Before transactions, ");
        ba1.display(); // Вывод баланса
        ba1.deposit(74.35); // Внесение средств
        ba1.withdraw(20.00); // Снятие средств
        System.out.print("After transactions, ");
        ba1.display(); // Вывод баланса
    } // Конец main()
} // Конец класса BankApp