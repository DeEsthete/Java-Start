package international.dz;

import jdk.nashorn.internal.runtime.regexp.joni.Regex;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите язык общения в формате: en_US");
        String choice = scanner.next();
        choice = choice.trim();
        String[] choiceArray = choice.split("_");
        Locale locale = new Locale(choiceArray[0], choiceArray[1]);
        ResourceBundle rb = ResourceBundle.getBundle("international.dz.international_translator", locale);
        System.out.println(rb.getString("system.proc_count") + ": " + Runtime.getRuntime().availableProcessors());
        System.out.println(rb.getString("system.total_memory") + ": " + Runtime.getRuntime().totalMemory());
        System.out.println(rb.getString("system.free_memory") + ": " + Runtime.getRuntime().freeMemory());
    }
}