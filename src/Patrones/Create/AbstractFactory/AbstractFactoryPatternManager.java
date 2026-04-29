package Patrones.Create.AbstractFactory;

import Patrones.Create.AbstractFactory.UICreation.Parte1.AbstractFactoryUIExerciseP1;
import Patrones.Create.AbstractFactory.UICreation.Parte2.AbstractFactoryUIExerciseP2;
import SharedInterfaces.PatternSelection;

public class AbstractFactoryPatternManager extends PatternSelection {
    public AbstractFactoryPatternManager() {
        super("Abstract Factory");

        add(new AbstractFactoryUIExerciseP1());
        add(new AbstractFactoryUIExerciseP2());
    }
}
