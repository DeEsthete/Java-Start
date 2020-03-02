package user_exception.ex;

import user_exception.ex.classes.FaqWork;
import user_exception.ex.exceptions.StupidQuestException;
import user_exception.ex.exceptions.StupidUserException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FaqWork faq = new FaqWork();
        try {
            faq.initWork();
        } catch (StupidUserException ex) {
            System.out.println(ex + " " + ex.getUncorrectedProperty());
        }
        try {
            faq.work();
        } catch (StupidQuestException ex) {
            System.out.println(ex + " Воспрос: " + ex.getUncorrectedQuest());
        }
        finally {
            System.out.println("Все!");
        }
    }
}