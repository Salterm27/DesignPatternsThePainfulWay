package Patrones.Behave;

import Patrones.Create.Factory.FactoryPatternManager;
import SharedInterfaces.PatternGroup;

public class BehaviouralPatternsManager extends PatternGroup {
    public BehaviouralPatternsManager() {
        super("Comportamiento");

        add(new FactoryPatternManager());
    }
}
