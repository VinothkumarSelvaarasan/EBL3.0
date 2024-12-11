package com.wecp;

import java.util.*;

public class TextAnalyzer {

    @FunctionalInterface
    public interface WordCounter {
        int count(String text);
    }

    @FunctionalInterface
    public interface CharacterCounter {
        int count(String text);
    }

    @FunctionalInterface
    public interface LineCounter {
        int count(String text);
    }

    public static int countWords(String text) {
        WordCounter wordCounter = (t) -> t.split("\\s+").length;
        return wordCounter.count(text);
    }

    public static int countCharacters(String text) {
        CharacterCounter characterCounter = (t) -> t.replaceAll("\\s+", "").length();
        return characterCounter.count(text);
    }

    public static int countLines(String text) {
        LineCounter lineCounter = (t) -> (int) t.lines().count();
        return lineCounter.count(text);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder inputText = new StringBuilder();

        System.out.println("Enter text (end input with 'end'): ");

        String line;
        while (!(line = scanner.nextLine()).equals("end")) {
            inputText.append(line).append("\n");
        }

        String text = inputText.toString();

        int wordCount = countWords(text);
        int characterCount = countCharacters(text);
        int lineCount = countLines(text);

        System.out.println("Word Count: " + wordCount);
        System.out.println("Character Count: " + characterCount);
        System.out.println("Line Count: " + lineCount);
    }
}
