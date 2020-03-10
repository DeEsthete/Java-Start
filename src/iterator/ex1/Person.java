package iterator.ex1;

import java.io.Serializable;
import java.util.Comparator;

public class Person implements Serializable {
    private String firstName;
    private String middleName;
    private String lastName;
    private int age;
    private String groupName;

    public Person(String firstName, String middleName, String lastName, int age, String groupName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.age = age;
        this.groupName = groupName;
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

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age + '\'' +
                ", group=" + groupName + '\'' +
                '}';
    }

    public static Comparator<Person> getComparator(ComparableField field) {
        switch (field){
            case LAST_NAME:
                return new LastNameComparator();
            case GROUP_NAME:
                return new GroupNameComparator();
            default:
                return null;
        }
    }

    private static class LastNameComparator implements Comparator<Person> {
        public int compare(Person a, Person b)
        {
            return a.getLastName().compareTo(b.getLastName());
        }
    }

    private static class GroupNameComparator implements Comparator<Person> {
        public int compare(Person a, Person b)
        {
            return a.getGroupName().compareTo(b.getGroupName());
        }
    }
}