package Patrones.Create.AbstractFactory.UICreation.Parte2;

import SharedInterfaces.Exercise;

public class AbstractFactoryUIExerciseP2 implements Exercise {
    @Override
    public String getName() {
        return "Abstract Factory - Parte 2";
    }

    @Override
    public void run() {
        System.out.println("Ejercicio Abstract Factory - Parte 2");
        System.out.println("----------------------------------------");
        MyDesktopApplicationP2 app = new MyDesktopApplicationP2();
        app.renderUI("MacOS");

    }
}
