package Patrones.Structure.Adapter.Part1;

public class Pago {
    private int monto;
    private String moneda;
    private String id;

    public Pago(int monto, String moneda, String id) {
        this.monto = monto;
        this.moneda = moneda;
        this.id = id;
    }
    public int getMonto() {
        return monto;
    }
    public String getMoneda() {
        return moneda;
    }
    public String getId() {
        return id;
    }
}
