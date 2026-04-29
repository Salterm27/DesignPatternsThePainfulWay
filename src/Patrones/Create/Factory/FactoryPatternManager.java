package Patrones.Create.Factory;

import Patrones.Create.Factory.NotificationService.Part1.FactoryNotificationsExerciseP1;
import Patrones.Create.Factory.NotificationService.Part2.FactoryNotificationsExerciseP2;
import Patrones.Create.Factory.NotificationService.Part3.FactoryNotificationsExerciseP3;
import SharedInterfaces.PatternSelection;

public class FactoryPatternManager extends PatternSelection {
    public FactoryPatternManager() {
        super("Factory");

        add(new FactoryNotificationsExerciseP1());
        add(new FactoryNotificationsExerciseP2());
        add(new FactoryNotificationsExerciseP3());
    }
}
