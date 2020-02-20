package account.ex;

public class Account {
    private long money;
    private Person owner;

    public class Person {
        private String firstName;
        private String middleName;
        private String lastName;
        private int age;

        public Person() {
        }

        public Person(String firstName, String middleName, String lastName, int age) {
            this.firstName = firstName;
            this.middleName = middleName;
            this.lastName = lastName;
            this.age = age;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getMiddleName() {
            return middleName;
        }

        public void setMiddleName(String middleName) {
            this.middleName = middleName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "firstName='" + firstName + '\'' +
                    ", middleName='" + middleName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", age=" + age +
                    '}';
        }
    }

    public static class Transaction {
        private Account owner;
        private Account recipient;
        private long money;
        private TransactionType type;

        public Transaction() {
        }

        public Transaction(Account owner, Account recipient, long money, TransactionType type) {
            this.owner = owner;
            this.recipient = recipient;
            this.money = money;
            this.type = type;
        }

        public Transaction(Transaction transaction) {
            this.owner = transaction.owner;
            this.recipient = transaction.recipient;
            this.money = transaction.money;
            this.type = transaction.type;
        }

        public Account getOwner() {
            return owner;
        }

        public void setOwner(Account owner) {
            this.owner = owner;
        }

        public Account getRecipient() {
            return recipient;
        }

        public void setRecipient(Account recipient) {
            this.recipient = recipient;
        }

        public long getMoney() {
            return money;
        }

        public void setMoney(long money) {
            this.money = money;
        }

        public TransactionType getType() {
            return type;
        }

        public void setType(TransactionType type) {
            this.type = type;
        }

        @Override
        public String toString() {
            return "Transaction{" +
                    "owner=" + owner +
                    ", recipient=" + recipient +
                    ", money=" + money +
                    ", type=" + type +
                    '}';
        }
    }

    public Account() {
    }

    public Account(long money, String firstName, String middleName, String lastName, int age) {
        this.money = money;
        this.owner = new Person(firstName, middleName, lastName, age);
    }

    public long getMoney() {
        return money;
    }

    public void setMoney(long money) {
        this.money = money;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Account{" +
                "money=" + money +
                ", owner=" + owner +
                '}';
    }
}