package Patrones.Structure.Adapter;

import SharedInterfaces.PatternSelection;

public class AdapterPatternManager extends PatternSelection {
    public AdapterPatternManager() {
        super("Adapter");

        add(new AdapterReportGeneratorExerciseP1());
    }
}
