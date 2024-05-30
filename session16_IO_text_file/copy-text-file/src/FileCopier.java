import java.io.*;
import java.util.Scanner;

public class FileCopier {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Input source file's path: ");
            String sourceFilePath = scanner.nextLine();
            System.out.print("Input target file's path: ");
            String targetFilePath = scanner.nextLine();
            copyFile(sourceFilePath, targetFilePath);

            scanner.close();

    }
    public static void copyFile(String sourceFilePath, String targetFilePath) {
        File sourceFile = new File(sourceFilePath);
        File targetFile = new File(targetFilePath);
        try {

            if (!sourceFile.exists()) {
                throw new FileNotFoundException();
            }

            if (!targetFile.exists()) {
                throw new FileNotFoundException();
            }
        }catch (FileNotFoundException e) {
            System.out.println("File not found: " + sourceFilePath);
        }

        try (FileReader fileReader = new FileReader(sourceFile);
             FileWriter fileWriter = new FileWriter(targetFile)) {

            int character;
            int charCount = 0;

            while ((character = fileReader.read()) != -1) {
                fileWriter.write(character);
                charCount++;
            }

            System.out.println("Number of characters in file: " + charCount);

        } catch (IOException e) {
            System.out.println("An error occurred");
        }
    }

}
