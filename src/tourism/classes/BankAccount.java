package tourism.classes;

public class BankAccount extends Entity {
    private long money;

    public BankAccount(long money) {
        this.money = money;
    }

    public long getMoney() {
        return money;
    }

    public void withdraw(long count) {
        if (money >= count)
            money -= count;
    }

    public void charge(long count) {
        money += count;
    }
}