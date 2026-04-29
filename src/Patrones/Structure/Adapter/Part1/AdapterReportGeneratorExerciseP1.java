package Patrones.Structure.Adapter.Part1;

import SharedInterfaces.Exercise;

import java.util.ArrayList;
import java.util.List;

public class AdapterReportGeneratorExerciseP1 implements Exercise {
    @Override
    public String getName() {
        return "Adapter - Parte 1";
    }

    @Override
    public void run() {

        System.out.println("Ejercicio Adapter - Parte 1");
        List<Pago> losPagos = new ArrayList<Pago>();
        losPagos.add(new Pago(10, "ARS","1"));
        losPagos.add(new Pago(10, "USD","2"));

        new ReportGeneratorP1().generateReporte(losPagos);

    }
}
