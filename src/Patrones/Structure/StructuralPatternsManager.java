package Patrones.Structure;

import Patrones.Structure.Adapter.AdapterPatternManager;
import SharedInterfaces.PatternGroup;

public class StructuralPatternsManager extends PatternGroup {
    public StructuralPatternsManager() {
        super("Estructurales");

        add(new AdapterPatternManager());
    }
}
