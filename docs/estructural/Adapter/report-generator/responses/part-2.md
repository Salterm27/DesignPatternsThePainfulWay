# Ejercicio  — Adapter
## Paso 2: Revisión del código y respuestas

---

## ✅ Lo que estaba bien

- La conversión de `MPTransaction` a `Pago` funciona correctamente.
- El cliente queda limpio — delega la conversión a `ReportGeneratorP2`.

---

## ⚠️ Problema 1 — Violación de SRP

Pusiste `convertirPagos(...)` **dentro de `ReportGeneratorP2`**.
Eso le da dos responsabilidades a la misma clase:

1. Saber cómo convertir `MPTransaction` → `Pago`
2. Saber cómo generar un reporte

Un generador de reportes no debería saber nada de MercadoPago.
Cuando llegue Stripe, ¿también le agregás `convertirStripePayment()`
a `ReportGenerator`? La clase se convierte en un repositorio de
conversiones disfrazado de generador de reportes.

---

## ⚠️ Problema 2 — Pérdida silenciosa de datos

```java
new Pago((int) transaccion.getAmount(), ...)
```

`getAmount()` devuelve `1500.50f`. El cast a `int` lo convierte en `1500`.
**Los 50 centavos desaparecen sin ningún aviso.**

- El código compila sin warnings.
- El código corre sin excepciones.
- El reporte muestra un monto incorrecto.

En un sistema financiero eso es un bug crítico. La decisión de cómo
manejar los decimales está enterrada en el medio de un loop,
sin ninguna documentación ni intención clara.

---

## Respuesta a la pregunta del enunciado

> Si llegan PayPal y Stripe con sus propios objetos incompatibles,
> ¿cuántas conversiones nuevas aparecen? ¿Es ese el trabajo del cliente?

Con el diseño del Paso 2 necesitarías:

| Proveedor nuevo | Qué hay que agregar a `ReportGenerator` |
|---|---|
| Stripe | `convertirStripe(List<StripeCharge>)` + `generateReporte(...)` |
| PayPal | `convertirPayPal(List<PayPalPayment>)` + `generateReporte(...)` |
| ... | ... |

`ReportGenerator` crece con cada proveedor nuevo, **por razones
que no tienen nada que ver con generar reportes**.

No, no es el trabajo del cliente ni del generador de reportes.
Es exactamente el trabajo del **Adapter** — que es lo que vemos
en el Paso 3.