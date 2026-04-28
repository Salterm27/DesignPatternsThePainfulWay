package Patrones.Create.Factory;

import Patrones.Create.Factory.NotificationService.FactoryNotificationsExercise;
import SharedInterfaces.PatternSelection;

public class FactoryPatternManager extends PatternSelection {
    public FactoryPatternManager() {
        super("Factory");

        add(new FactoryNotificationsExercise());
    }
}
