package Patrones.Create.Singleton;

import Patrones.Create.Singleton.Part1.SingletonConfigManagerExerciseP1;
import Patrones.Create.Singleton.Part2.SingletonConfigManagerExerciseP2;
import Patrones.Create.Singleton.Part3.SingletonConfigManagerExerciseP3;
import SharedInterfaces.PatternSelection;

public class SingletonPatternManager extends PatternSelection {
    public SingletonPatternManager() {
        super("Singleton");

        add(new SingletonConfigManagerExerciseP1());
        add(new SingletonConfigManagerExerciseP2());
        add(new SingletonConfigManagerExerciseP3());
    }

}
