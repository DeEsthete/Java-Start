package tourism.classes;

public class Person extends Entity {
    private String firstName;
    private String middleName;
    private String lastName;
    private BankAccount account;

    public Person() {
    }

    public Person(String firstName, String middleName, String lastName, BankAccount bankAccount) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.account = bankAccount;
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

    public BankAccount getAccount() {
        return account;
    }

    public void setAccount(BankAccount account) {
        this.account = account;
    }
}