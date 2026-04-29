package Patrones.Create.AbstractFactory;

import SharedInterfaces.PatternSelection;

public class AbstractFactoryPatternManager extends PatternSelection {
    public AbstractFactoryPatternManager() {
        super("Factory");

        add(new AbstractFactoryUIExerciseP1());
    }
}
