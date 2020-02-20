package com.domain;

import java.util.Arrays;

public class TextWork {
    public static String clearExtraSpaces(String text) {
        String[] words = text.split(" ");
        StringBuilder result = new StringBuilder();
        Arrays.stream(words).filter(w -> w.length() > 0).forEach(w -> result.append(" ").append(w));
        return result.toString();
    }

    public static String removeSmallWords(String text) {
        String[] words = text.split(" ");
        StringBuilder result = new StringBuilder();
        Arrays.stream(words).filter(w -> w.length() > 5).forEach(w -> result.append(" ").append(w));
        return result.toString();
    }

    public static String sortCharsInWords(String text) {
        String[] words = text.split(" ");
        StringBuilder result = new StringBuilder();
        Arrays.stream(words).map(w -> {
            char[] chars = w.toCharArray();
            Arrays.sort(chars);
            return String.valueOf(chars);
        }).forEach(w -> result.append(" ").append(w));
        return result.toString();
    }
}