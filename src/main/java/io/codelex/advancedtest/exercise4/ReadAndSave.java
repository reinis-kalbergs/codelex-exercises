package io.codelex.advancedtest.exercise4;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class ReadAndSave {
    private static final String PATH_TO_FILE = "C:\\Users\\user\\Codelex\\JAVA\\codelex-exercises\\src\\main\\java\\io\\codelex\\advancedtest\\exercise4\\";

    public static void main(String[] args) {

        try {
            String fileName = "test.txt";
            BufferedReader in = new BufferedReader(new FileReader(PATH_TO_FILE + fileName));
            String line;
            List<String> allLines = new ArrayList<>();
            while ((line = in.readLine()) != null) {
                allLines.add(line);
            }

            String[] temp = fileName.split(Pattern.quote("."));
            StringBuilder reverseFileName = new StringBuilder(temp[0]);
            reverseFileName.reverse();

            BufferedWriter out = new BufferedWriter(new FileWriter(PATH_TO_FILE + reverseFileName + "." + temp[1]));

            for (int i = allLines.size() - 1; i >= 0; i--) {
                StringBuilder reverseLine = new StringBuilder(allLines.get(i));
                out.write(reverseLine.reverse().toString());
                if (i != 0) {
                    out.write("\n");
                }
            }
            in.close();
            out.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
