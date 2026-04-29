package Patrones.Structure.Adapter.Part2;

import Patrones.Structure.Adapter.Part1.Pago;
import Patrones.Structure.Adapter.Part2.MP.MPTransaction;
import Patrones.Structure.Adapter.Part2.MP.ReportGeneratorP2;
import SharedInterfaces.Exercise;

import java.util.ArrayList;
import java.util.List;

public class AdapterReportGeneratorExerciseP2 implements Exercise {
    @Override
    public String getName() {
        return "Adapter - Parte 2";
    }

    @Override
    public void run() {

        System.out.println("Ejercicio Adapter - Parte 2");
        List<MPTransaction> transaccionesMP = new ArrayList<MPTransaction>();
        transaccionesMP.add(new MPTransaction("1",10,"ARS"));
        transaccionesMP.add(new MPTransaction("1",10,"USD"));

        List<Pago> pagos = new ReportGeneratorP2().convertirPagos(transaccionesMP);
        new ReportGeneratorP2().generateReporte(pagos);
    }
}
