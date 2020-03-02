package iterator.ex;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("Hello");
        strings.add("Leha");
        strings.add("Go");
        strings.add("Igrat");

        Iterator iterator = strings.listIterator();
        iterator.forEachRemaining(s -> System.out.println(s));
    }

    private static void readAndWriteFile() {
        File file = new File("notes.txt");
        List<String> strings = new ArrayList<String>();

        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNextLine()) {
                String line = sc.nextLine().trim();
                strings.add(line);
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        strings = reverse(strings);

        try (FileWriter writer = new FileWriter("notesReverse.txt", false)) {
            String text = "Hello Gold!";
            Iterator<String> iterator = strings.iterator();
            while (iterator.hasNext()) {
                writer.write(iterator.next() + "\n");
            }
            writer.flush();
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }

    private static List<String> reverse(List<String> list) {
        List<String> temp = new ArrayList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            temp.add(list.get(i));
        }
        return temp;
    }
}