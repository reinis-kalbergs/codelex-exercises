package io.codelex.collections.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class FlightPlanner {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "/collections/flights.txt";

    public static void main(String[] args) throws IOException, URISyntaxException {
        final Path path = Paths.get(Histogram.class.getResource(file).toURI());
        List<String> data = Files.readAllLines(path, charset);
        Map<String, Set<String>> flightsMap = getData(data);

        List<String> flightsBooked = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("The list of all cities. Please pick your starting location:");
        String input = getInitialInput(flightsMap, sc); //Gets input and displays cities
        flightsBooked.add(input);

        if (!input.equals("q")) {

            while (flightIsOngoing(input, flightsBooked)) {
                System.out.println("Select a location to travel to:");
                input = getInput(flightsMap.get(input), sc);
                if (input.equals("q")) {
                    break;
                }
                flightsBooked.add(input);
            }
            displayFlightsTaken(flightsBooked);
        }

    }

    private static Map<String, Set<String>> getData(List<String> data) {
        Map<String, Set<String>> result = new HashMap<>();
        for (String line : data) {
            if (line.isBlank()) {
                continue;
            }
            String[] city = line.split(" -> ");
            if (!result.containsKey(city[0])) {
                result.put(city[0], new HashSet<>());
            }
            result.get(city[0]).add(city[1]);
        }
        return result;
    }

    private static String getInitialInput(Map<String, Set<String>> map, Scanner sc) {
        Set<String> choices = new HashSet<>(map.keySet());
        return getInput(choices, sc);
    }

    private static String getInput(Set<String> locations, Scanner sc) {
        System.out.println(locations);
        String input = "";
        while (!locations.contains(input)) {
            System.out.print("Choose a city (or write 'q' to quit): ");
            input = sc.nextLine();
            if (input.equalsIgnoreCase("q")) {
                return "q";
            }
            if (!locations.contains(input)) {
                System.out.println("Not a possible choice. PLease try again.");
            }
        }
        return input;
    }

    private static boolean flightIsOngoing(String input, List<String> flightsBooked) {
        return flightsBooked.size() == 1 || !input.equals(flightsBooked.get(0));
    }

    private static void displayFlightsTaken(List<String> flightsBooked) {
        StringBuilder result = new StringBuilder();
        for (String location : flightsBooked) {
            result.append(location).append(" -> ");
        }
        System.out.println(result.substring(0, result.length() - 4));
    }

}
