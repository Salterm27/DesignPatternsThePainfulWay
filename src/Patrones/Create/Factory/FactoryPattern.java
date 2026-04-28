package Patrones.Create.Factory;

import SharedInterfaces.PatternSelection;

public class FactoryPattern extends PatternSelection {
    public FactoryPattern() {
        super("Factory");

        add(new FactoryPart1Exercise());
    }
}
