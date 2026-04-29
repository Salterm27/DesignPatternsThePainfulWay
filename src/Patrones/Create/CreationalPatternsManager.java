package Patrones.Create;

import Patrones.Create.AbstractFactory.AbstractFactoryPatternManager;
import Patrones.Create.Factory.FactoryPatternManager;
import SharedInterfaces.PatternGroup;

public class CreationalPatternsManager extends PatternGroup {
    public CreationalPatternsManager() {
        super("Creacionales");

        add(new FactoryPatternManager());
        add(new AbstractFactoryPatternManager());
    }
}
