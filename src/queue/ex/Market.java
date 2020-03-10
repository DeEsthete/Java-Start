package queue.ex;

public class Market {
    private int money;

    public boolean payAccept(IPayable payableEntity, Items item) {
        if (payableEntity.pay(item.getPrice())){
            money += item.getPrice();
            System.out.println("Был куплен: " + item.name() + " за " + item.getPrice());
            return true;
        }
        System.out.println("Не был куплен: " + item.name() + " за " + item.getPrice());
        return false;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}