package SharedInterfaces;

import java.util.Scanner;

public interface Exercise extends MenuOption {
    void run();

    @Override
    default void execute(Scanner scanner) {
        run();
    }
}
