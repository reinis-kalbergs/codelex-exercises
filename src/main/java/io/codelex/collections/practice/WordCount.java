package io.codelex.collections.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class WordCount {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "/collections/lear.txt";

    public static void main(String[] args) throws IOException, URISyntaxException {
        final Path path = Paths.get(Histogram.class.getResource(file).toURI());
        List<String> allLines = Files.readAllLines(path, charset);
        System.out.println(allLines);
        int lines = allLines.size();
        int words = 0;
        int chars = 0;

        for (String line : allLines) {
            words += wordCount(line);
            chars += line.length();
        }

        System.out.println("Lines = " + lines);
        System.out.println("Words = " + words);
        System.out.println("Chars = " + chars);
    }

    private static int wordCount(String line) {
        int count = 0;
        for (int i = 0; i < line.length(); i++) {
            if (Character.isLetterOrDigit(line.charAt(i))) {
                if (i == 0 || !Character.isLetterOrDigit(line.charAt(i - 1))) {
                    // if (firstCharacter OR previousCharacter is not a letter)
                    count++;
                }
            }
        }
        return count;
    }
}
