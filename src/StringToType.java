
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class StringToType {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> types = new ArrayList<>();

        String inputText;

        while (true) {
            inputText = reader.readLine().toLowerCase();

            if (inputText.isEmpty()) {

                break;

            } else if (inputText.equals("int") || inputText.equals("char") || inputText.equals("long") ||
                    inputText.equals("float") || inputText.equals("byte") ||
                    inputText.equals("short") || inputText.equals("double")) {
                types.add(inputText);
            } else System.out.println("You have entered wrong type of data");
        }


        for (int i = 0; i < types.size(); i++) {

            if (types.get(i).equals("int")) {
                printIntValues();
            } else if (types.get(i).equals("char")) {
                printCharValues();
            } else if (types.get(i).equals("long")) {
                printLongValues();
            } else if (types.get(i).equals("float")) {
                printFloatValues();
            } else if (types.get(i).equals("byte")) {
                printByteValues();
            } else if (types.get(i).equals("short")) {
                printShortValues();
            } else if (types.get(i).equals("double")) {
                printDoubleValues();
            }

        }

        if (types.isEmpty()) {

            System.out.println("All types of data:\n");
            printIntValues();
            printCharValues();
            printLongValues();
            printFloatValues();
            printByteValues();
            printShortValues();
            printDoubleValues();

        }
    }

    public static void printIntValues() {
        System.out.println("Type int, min value: " + Integer.MIN_VALUE);
        System.out.println("Type int, max value: " + Integer.MAX_VALUE);
        System.out.println();
    }

    public static void printCharValues() {
        System.out.println("Type char, min value: " + (int) Character.MIN_VALUE);
        System.out.println("Type char, max value: " + (int) Character.MAX_VALUE);
        System.out.println();

    }

    public static void printLongValues() {
        System.out.println("Type long, min value: " + Long.MIN_VALUE);
        System.out.println("Type long, max value: " + Long.MAX_VALUE);
        System.out.println();

    }

    public static void printFloatValues() {
        System.out.println("Type float, min value: " + Float.MIN_VALUE);
        System.out.println("Type float, max value: " + Float.MAX_VALUE);
        System.out.println();

    }

    public static void printByteValues() {
        System.out.println("Type byte, min value: " + Byte.MIN_VALUE);
        System.out.println("Type byte, max value: " + Byte.MAX_VALUE);
        System.out.println();

    }

    public static void printShortValues() {
        System.out.println("Type short, min value: " + Short.MIN_VALUE);
        System.out.println("Type short, max value: " + Short.MAX_VALUE);
        System.out.println();

    }

    public static void printDoubleValues() {
        System.out.println("Type double, min value: " + Double.MIN_VALUE);
        System.out.println("Type double, max value: " + Double.MAX_VALUE);
        System.out.println();

    }


}