package SharedInterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuGroup implements MenuOption {
    private final String name;
    private final String exitOption;
    private final List<MenuOption> options = new ArrayList<>();

    public MenuGroup(String name) {
        this(name, "Volver");
    }

    public MenuGroup(String name, String exitOption) {
        this.name = name;
        this.exitOption = exitOption;
    }

    public void add(MenuOption option) {
        options.add(option);
    }

    public List<MenuOption> getOptions() {
        return new ArrayList<>(options);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void execute(Scanner scanner) {
        if (options.isEmpty()) {
            System.out.println("No hay opciones disponibles todavia.");
            return;
        }

        while (true) {
            System.out.println("\n--- " + name + " ---");
            for (int i = 0; i < options.size(); i++) {
                System.out.println((i + 1) + ". " + options.get(i).getName());
            }
            System.out.println("0. " + exitOption);
            System.out.print("Seleccion: ");

            try {
                int choice = Integer.parseInt(scanner.nextLine());
                if (choice == 0) {
                    break;
                }
                if (choice >= 1 && choice <= options.size()) {
                    options.get(choice - 1).execute(scanner);
                } else {
                    System.out.println("Opcion inexistente.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Ingrese un numero valido.");
            }
        }
    }
}
