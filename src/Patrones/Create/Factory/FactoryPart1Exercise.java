package Patrones.Create.Factory;

import SharedInterfaces.Exercise;

public class FactoryPart1Exercise implements Exercise {
    @Override
    public String getName() {
        return "Factory - Parte 1";
    }

    @Override
    public void run() {
        System.out.println("Ejercicio Factory - Parte 1");
    }
}
