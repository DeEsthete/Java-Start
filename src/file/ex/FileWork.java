package file.ex;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileWork {
    private String fileName;

    public FileWork(String filename) {
        this.fileName = filename;
    }

    public void replaceSubstring(String search, String replace) throws IOException {
        Charset charset = StandardCharsets.UTF_8;
        Path path = Paths.get(fileName);
        Files.write(path, new String(Files.readAllBytes(path), charset).replace(search, replace).getBytes(charset));
    }

    public void removeSubstring(String search) throws IOException {
        replaceSubstring(search, "");
    }

    public void sheakespeareText() throws IOException {
        Charset charset = StandardCharsets.UTF_8;
        Path path = Paths.get(fileName);
        String text = new String(Files.readAllBytes(path), charset);

        StringBuilder resultText = new StringBuilder();
        Arrays.asList(text.split("\n")).forEach(line -> {
            Arrays.asList(line.split(" ")).forEach(s -> {
                if (s.charAt(0) != s.toLowerCase().charAt(0)) {
                    resultText.append(s.toLowerCase().charAt(0)).append(s.substring(1, s.length()));
                } else {
                    resultText.append(s);
                }
                resultText.append(" ");
            });
            resultText.append("\n");
        });

        System.out.println(resultText.toString());

        try (FileWriter writer = new FileWriter("FileTest3.txt", false)) {
            writer.write(resultText.toString());
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
}