package Patrones.Structure;

import Patrones.Create.Factory.FactoryPatternManager;
import SharedInterfaces.PatternGroup;

public class StructuralPatternsManager extends PatternGroup {
    public StructuralPatternsManager() {
        super("Estructurales");

        add(new FactoryPatternManager());
    }
}
