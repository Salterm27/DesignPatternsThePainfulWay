# Ejercicio 4 — Adapter

## 🎯 Paso 2: La curva — una librería externa incompatible (CORREGIDO)

El e-commerce creció y contrató un nuevo proveedor de pagos: **MercadoPago**.
Su SDK ya está integrado en el sistema y no podés modificarlo bajo ningún concepto
— es código de terceros.

El SDK de MercadoPago te entrega los pagos como objetos `MPTransaction`:

```java
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
```

Notá las diferencias con tu clase `Pago`:

| `Pago` (tu sistema)   | `MPTransaction` (librería externa) |
|-----------------------|------------------------------------|
| `getId()`             | `getTransactionId()`               |
| `getMonto(): int`     | `getAmount(): float`               |
| `getMoneda(): String` | `getCurrencyCode(): String`        |

---

## Tu tarea

En el cliente, **antes de llamar a `generateReporte`**, convertí cada
`MPTransaction` a `Pago` manualmente y armá una nueva lista.

## Pregunta para responder cuando me pegués el código

> Si mañana llegan PayPal y Stripe con sus propios objetos incompatibles,
> ¿cuántas conversiones manuales nuevas aparecen en el cliente?
> ¿Es ese el trabajo del código cliente?