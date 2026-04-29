package Patrones;

import Patrones.Create.CreationalPatternsManager;
import Patrones.Structure.StructuralPatternsManager;
import SharedInterfaces.MenuOption;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PracticeExerciseRepo {
    private final List<MenuOption> patternGroups = new ArrayList<>();

    public PracticeExerciseRepo() {
        patternGroups.add(new CreationalPatternsManager());
        patternGroups.add(new StructuralPatternsManager());
    }

    public List<MenuOption> getAll() {
        return new ArrayList<>(patternGroups);
    }

    public Optional<MenuOption> get(int index) {
        return (index >= 0 && index < patternGroups.size())
                ? Optional.of(patternGroups.get(index))
                : Optional.empty();
    }
}
