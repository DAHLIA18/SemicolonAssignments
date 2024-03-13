package diaryApp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DiaryApp {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        Diary diary = new Diary("user", "1234");
        String choice = "0";

        while (!choice.equals("5")) {
            diary.printHomeScreen();
            System.out.println();
            System.out.println("Choose an action:");
            System.out.println("1 - Add an entry");
            System.out.println("2 - Search for entries");
            System.out.println("3 - Delete entries");
            System.out.println("4 - Update entries");
            System.out.println("5 - End");
            System.out.println();
            choice = scanner.nextLine();
            System.out.println();

            switch (choice) {
                case "1":
                    diary.createEntry(1, "title", "Today's is a good day");
                    break;
                case "2":
                    diary.getEntries();
                    break;
                case "3":
                    diary.deleteEntry(1);
                    break;
                case "4":
                    diary.updateEntry(1, "titleNew", "Updated entry");
                    break;
                case "5":
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Error. Press any key to choose another action.");
            }
        }
    }
}
