package Patrones.Create.AbstractFactory.UICreation.Parte1;

import SharedInterfaces.Exercise;

public class AbstractFactoryUIExerciseP1 implements Exercise {
    @Override
    public String getName() {
        return "Abstract Factory - Parte 1";
    }

    @Override
    public void run() {
        System.out.println("Ejercicio Factory - Parte 1");

    }
}
