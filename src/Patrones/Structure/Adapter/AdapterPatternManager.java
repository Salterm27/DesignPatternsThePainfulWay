package Patrones.Structure.Adapter;

import Patrones.Structure.Adapter.Part1.AdapterReportGeneratorExerciseP1;
import Patrones.Structure.Adapter.Part2.AdapterReportGeneratorExerciseP2;
import SharedInterfaces.PatternSelection;

public class AdapterPatternManager extends PatternSelection {
    public AdapterPatternManager() {
        super("Adapter");

        add(new AdapterReportGeneratorExerciseP1());
        add(new AdapterReportGeneratorExerciseP2());
    }
}
