package io.codelex.collections.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedHashMap;
import java.util.Map;

public class Histogram {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "/collections/midtermscores.txt";

    public static void main(String[] args) throws IOException, URISyntaxException {
        final String scores = fileContent();
        System.out.println(scores);

        final String[] scoresInArr = scores.split(" ");
        Map<Integer, Integer> histogram = new LinkedHashMap<>();
        initializeHistogram(histogram);

        for (String scoreInString : scoresInArr) {
            int score = Integer.parseInt(scoreInString);

            for (Integer upperRange : histogram.keySet()) {
                if (score <= upperRange) {
                    histogram.put(upperRange, histogram.get(upperRange) + 1);
                    break;
                }
            }

        }
        displayHistogram(histogram);

    }

    private static String fileContent() throws URISyntaxException, IOException {
        final Path path = Paths.get(Histogram.class.getResource(file).toURI());
        return Files.readAllLines(path, charset).stream()
                .findFirst()
                .orElseThrow(IllegalStateException::new);
    }

    private static void initializeHistogram(Map<Integer, Integer> histogram) {
        // Each value represents the upper value of a range
        for (int i = 0; i < 10; i++) {
            histogram.put(i * 10 + 9, 0);
        }
        histogram.put(100, 0);
    }

    private static void displayHistogram(Map<Integer, Integer> histogram) {
        for (Integer upperRange : histogram.keySet()) {
            if (upperRange == 100) {
                System.out.println(upperRange + ": " + starsToString(histogram.get(upperRange)));
            } else {
                System.out.println((upperRange - 9) + "-" + upperRange + ": " + starsToString(histogram.get(upperRange)));
            }
        }
    }

    private static String starsToString(int howMany) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < howMany; i++) {
            builder.append("*");
        }
        return builder.toString();
    }
}
