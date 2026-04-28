package Patrones.Structure;

import Patrones.Create.Factory.FactoryPattern;
import SharedInterfaces.PatternGroup;

public class StructuralPatterns extends PatternGroup {
    public StructuralPatterns() {
        super("Estructurales");

        add(new FactoryPattern());
    }
}
