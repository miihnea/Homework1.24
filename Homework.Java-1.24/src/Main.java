import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\brule\\IdeaProjects\\Homework.Java-1.24\\src\\input.txt"); // numele fișierului poate fi înlocuit cu alt nume
        int sum = 0;

        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                try {
                    int number = Integer.parseInt(line);
                    sum += number;
                } catch (NumberFormatException e) {
                    // Ignorăm această linie
                }
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Fișierul nu a putut fi găsit.");
        }

        System.out.println("Suma numerelor întregi din fișier este: " + sum);
    }
}
