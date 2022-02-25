package io.codelex.typesandvariables.exercises;

public class exercise5 {
    public static void main(String[] args) {


        String course1 = "English";
        String course2 = "Maths";
        String course3 = "Computer Architecture";
        String course4 = "Data structures";
        String course5 = "Discrete Mathematics";
        String course6 = "ABC";
        String course7 = "DEF";
        String course8 = "asd";

        String teacher1 = "Ms. Lapan";
        String teacher2 = "Mrs. Gideon";
        String teacher3 = "Mr. Davis";
        String teacher4 = "Ms. Palmer";
        String teacher5 = "Ms. Garcia";
        String teacher6 = "Mrs. Barnett";
        String teacher7 = "Ms. Johannessen";
        String teacher8 = "Mr. James";


        System.out.println("+------------------------------------------------+");
        System.out.println("| 1 |"+textWithSpaces(course1,26)+" | "+textWithSpaces(teacher1,16)+" |");
        System.out.println("| 2 |"+textWithSpaces(course2,26)+" | "+textWithSpaces(teacher2,16)+" |");
        System.out.println("| 3 |"+textWithSpaces(course3,26)+" | "+textWithSpaces(teacher3,16)+" |");
        System.out.println("| 4 |"+textWithSpaces(course4,26)+" | "+textWithSpaces(teacher4,16)+" |");
        System.out.println("| 5 |"+textWithSpaces(course5,26)+" | "+textWithSpaces(teacher5,16)+" |");
        System.out.println("| 6 |"+textWithSpaces(course6,26)+" | "+textWithSpaces(teacher6,16)+" |");
        System.out.println("| 7 |"+textWithSpaces(course7,26)+" | "+textWithSpaces(teacher7,16)+" |");
        System.out.println("| 8 |"+textWithSpaces(course8,26)+" | "+textWithSpaces(teacher8,16)+" |");
        System.out.println("+------------------------------------------------+");

    }

    public static String textWithSpaces(String text, int len) {
        String result = text;
        if (text.length() < len) {
            for (int i = 1; i < len - text.length(); i++) {
                result = " " + result;
            }
        }
        return result;
    }
}
