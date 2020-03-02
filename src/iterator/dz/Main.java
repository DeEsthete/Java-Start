package iterator.dz;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Путь: ");
        String dirName = scanner.next();

        List<String> fileNames = new ArrayList<>();
        try {
            Files.walk(Paths.get(dirName))
                    .collect(Collectors.toCollection(LinkedList::new))
                    .descendingIterator()
                    .forEachRemaining(path -> fileNames.add(path.getFileName().toString()));
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        fileNames.listIterator().forEachRemaining(s -> System.out.println(s));
    }
}