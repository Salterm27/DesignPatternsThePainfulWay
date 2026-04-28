package Patrones.Create;

import Patrones.Create.Factory.FactoryPattern;
import SharedInterfaces.PatternGroup;

public class CreationalPatterns extends PatternGroup {
    public CreationalPatterns() {
        super("Creacionales");

        add(new FactoryPattern());
    }
}
