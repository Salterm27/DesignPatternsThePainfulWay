package Patrones.Structure.Adapter.Part2.MP;

import Patrones.Structure.Adapter.Part1.Pago;

import java.util.ArrayList;
import java.util.List;

public class ReportGeneratorP2 {
    public List<Pago> convertirPagos(List<MPTransaction> transacciones) {
        List<Pago> pagos = null;
        if (transacciones != null) {
            pagos = new ArrayList<Pago>();
            for (MPTransaction transaccion : transacciones) {
                pagos.add(
                        new Pago(
                            (int) transaccion.getAmount(),
                            transaccion.getCurrencyCode(),
                            transaccion.getTransactionId()
                        )
                );
            }
        }
        return pagos;
    }

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
