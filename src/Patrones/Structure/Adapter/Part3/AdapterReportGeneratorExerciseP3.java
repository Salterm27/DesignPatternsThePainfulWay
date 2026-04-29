package Patrones.Structure.Adapter.Part3;

import SharedInterfaces.Exercise;


public class AdapterReportGeneratorExerciseP3 implements Exercise {
    @Override
    public String getName() {
        return "Adapter - Parte 3";
    }

    @Override
    public void run() {

        System.out.println("Ejercicio Adapter - Parte 3");

    }
}
