package Patrones.Structure.Adapter.Part2.MP;

// CLASE DE TERCEROS — NO MODIFICAR
public class MPTransaction {
    private String transactionId;
    private float amount;
    private String currencyCode;

    public MPTransaction(String transactionId, float amount, String currencyCode) {
        this.transactionId = transactionId;
        this.amount = amount;
        this.currencyCode = currencyCode;
    }

    public String getTransactionId() { return transactionId; }
    public float getAmount()         { return amount; }
    public String getCurrencyCode()  { return currencyCode; }
}