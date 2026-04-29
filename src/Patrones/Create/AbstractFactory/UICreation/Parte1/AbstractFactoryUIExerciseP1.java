package Patrones.Create.AbstractFactory.UICreation.Parte1;

import SharedInterfaces.Exercise;

public class AbstractFactoryUIExerciseP1 implements Exercise {
    @Override
    public String getName() {
        return "Abstract Factory - Parte 1";
    }

    @Override
    public void run() {
        System.out.println("Ejercicio Abstract Factory - Parte 1");
        System.out.println("----------------------------------------");
        MyDesktopApplicationP1 app = new MyDesktopApplicationP1();
        app.renderUI();

    }
}
