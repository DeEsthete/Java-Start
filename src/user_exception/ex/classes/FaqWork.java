package user_exception.ex.classes;

import user_exception.ex.exceptions.StupidQuestException;
import user_exception.ex.exceptions.StupidUserException;

import java.util.Arrays;
import java.util.Dictionary;
import java.util.Scanner;

public class FaqWork {
    private final String[] QUESTS = {"Кто я?", "Как дела?", "Пока"};
    private final String[] ANSWERS = {"Ты это ты", "Нормально", "До скорого"};
    private String userName;
    private int age;

    public void initWork() throws StupidUserException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Твоя имя: ");
        String userName = scanner.next();
        if (userName.length() < 3) {
            throw new StupidUserException("userName");
        }
        System.out.print("Твой возраст: ");
        int age = scanner.nextInt();
        if (age < 8) {
            throw new StupidUserException("age");
        }
        this.userName = userName;
        this.age = age;
    }

    public void work() throws StupidQuestException {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Задвай вопрос");
            String userQuest = scanner.nextLine();
            int index = Arrays.asList(QUESTS).indexOf(userQuest);
            if (index < 0 || index > 3) {
                throw new StupidQuestException(userQuest);
            }
            System.out.println(ANSWERS[index]);
        }
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}