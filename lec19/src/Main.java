import java.io.*;
import java.util.Scanner;

public class Main {

    static void writeData(String data) {
        try {
            FileWriter writer = new FileWriter("New.txt", true); // append mode
            writer.write(data + "\n");
            writer.close();
            System.out.println("✔ Data written successfully!\n");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    static void readFile() {
        try {
            File file = new File("New.txt");
            if (!file.exists()) {
                System.out.println("❌ File does not exist! Please write something first.\n");
                return;
            }

            FileReader reader = new FileReader(file);
            int ch;
            System.out.println("📌 File Content:");
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }
            System.out.println("\n");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    static void deleteFile() {
        File file = new File("New.txt");
        if (file.exists()) {
            if (file.delete()) {
                System.out.println("🗑 File deleted successfully!\n");
            } else {
                System.out.println("❌ Could not delete the file.\n");
            }
        } else {
            System.out.println("❌ File not found.\n");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("----- FILE SYSTEM MENU -----");
            System.out.println("1. Write Data");
            System.out.println("2. Read File");
            System.out.println("3. Delete File");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {
                case 1:
                    System.out.print("Enter text to write: ");
                    String data = sc.nextLine();
                    writeData(data);
                    break;

                case 2:
                    readFile();
                    break;

                case 3:
                    deleteFile();
                    break;

                case 4:
                    System.out.println("👋 Exiting program...");
                    return;

                default:
                    System.out.println("❌ Invalid Option! Try again.\n");
            }
        }
    }
}
