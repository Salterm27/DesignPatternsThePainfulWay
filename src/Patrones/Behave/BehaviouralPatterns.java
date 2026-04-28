package Patrones.Behave;

import Patrones.Create.Factory.FactoryPattern;
import SharedInterfaces.PatternGroup;

public class BehaviouralPatterns extends PatternGroup {
    public BehaviouralPatterns() {
        super("Comportamiento");

        add(new FactoryPattern());
    }
}
