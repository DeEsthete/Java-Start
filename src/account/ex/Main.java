package account.ex;

public class Main {
    public static void main(String[] args) {
        Account account1 = new Account(400, "Ivan", "Ivanovich", "Ivanov", 21);
        Account account2 = new Account(200, "Petr", "Petrovich", "Petrov", 23);

        Account.Transaction transaction = new Account.Transaction(account1, account2, 100, TransactionType.TRANSFER);
        System.out.println("NORMAL TRANSACTION");
        System.out.println(transaction);
        System.out.println("SPECIFIC TRANSACTION");
        System.out.println(new Account.Transaction(transaction) {
            @Override
            public String toString() {
                System.out.println("I SPECIFIC TRANSACTION");
                return super.toString();
            }
        });
    }
}