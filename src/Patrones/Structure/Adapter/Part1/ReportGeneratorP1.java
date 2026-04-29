package Patrones.Structure.Adapter.Part1;

import java.util.List;

public class ReportGeneratorP1 {


    public void generateReporte(List<Pago> pagos) {
        System.out.println("Generando reporte de pagos");
        System.out.println("----------------------------------------");
        for (Pago pago : pagos) {
            System.out.println("Generando reporte para el pago " + pago.getId());
            System.out.println("Monto: " + pago.getMonto() + " " + pago.getMoneda());
            System.out.println("----------------------------------------");
        }
    }
}
