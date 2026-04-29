package Patrones.Create.AbstractFactory.UICreation.Parte3;

import Patrones.Create.AbstractFactory.UICreation.Parte3.Components.MacOS.MacOSFactory;
import SharedInterfaces.Exercise;

public class AbstractFactoryUIExerciseP3 implements Exercise {
    @Override
    public String getName() {
        return "Abstract Factory - Parte 3";
    }

    @Override
    public void run() {
        System.out.println("Ejercicio Abstract Factory - Parte 3");
        System.out.println("----------------------------------------");
        MyDesktopApplicationP3 app = new MyDesktopApplicationP3(new MacOSFactory());
        app.renderUI();
        System.out.println("----------------------------------------");
        app.renderUI();
    }
}
