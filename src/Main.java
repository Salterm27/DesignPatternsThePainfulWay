import Patrones.PracticeExerciseRepo;
import SharedInterfaces.MenuGroup;
import SharedInterfaces.MenuOption;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PracticeExerciseRepo practiceRepo = new PracticeExerciseRepo();
        Scanner scanner = new Scanner(System.in);

        MenuGroup mainMenu = new MenuGroup("Design Patterns - The Painful Way", "Salir");
        for (MenuOption option : practiceRepo.getAll()) {
            mainMenu.add(option);

        }

        mainMenu.execute(scanner);
        System.out.println("Goodbye!");
    }
}
