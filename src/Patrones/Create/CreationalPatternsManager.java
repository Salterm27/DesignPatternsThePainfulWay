package Patrones.Create;

import Patrones.Create.Factory.FactoryPatternManager;
import SharedInterfaces.PatternGroup;

public class CreationalPatternsManager extends PatternGroup {
    public CreationalPatternsManager() {
        super("Creacionales");

        add(new FactoryPatternManager());
    }
}
