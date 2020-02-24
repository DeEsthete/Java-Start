package doctor.ex.classes;

import java.util.Random;

public class Surgeon <T extends Living> extends Entity implements Doctor<T> {
    private String firstName;
    private String middleName;
    private String lastName;
    private int skillLevel;

    @Override
    public boolean doOperation(T living) {
        System.out.println("Делаю общую операцию на " + living.getName());
        Random random = new Random();
        return random.nextBoolean();
    }

    public int getSkillLevel() {
        return skillLevel;
    }

    public void setSkillLevel(int skillLevel) {
        this.skillLevel = skillLevel;
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
}