package queue.ex;

public class Consumer implements Comparable, IPayable {
    private String firstName;
    private String lastName;
    private int money;

    public Consumer() {
    }

    public Consumer(String firstName, String lastName, int money) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.money = money;
    }

    public boolean pay(int value) {
        if (money < value) return false;
        money -= value;
        return  true;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    @Override
    public int compareTo(Object object) {
        Consumer consumer = (Consumer) object;
        return consumer.getMoney() - money;
    }

    @Override
    public String toString() {
        return "Consumer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", money=" + money +
                '}';
    }
}