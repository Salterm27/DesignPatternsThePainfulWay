## Cosas para sentir mientras lo hacés

🔴 **¿Quién decide cómo convertir `float` a `int`?**
`MPTransaction.getAmount()` devuelve `float`. Tu `Pago` tiene `monto: int`.
¿Redondeás? ¿Truncás? ¿Perdés los centavos silenciosamente?
Esa decisión vive ahora en el cliente — un lugar donde no debería estar.

🔴 **El problema de la duplicación.**
Si en otro lugar del sistema (un `AuditService`, un `TaxCalculator`) también
necesitás convertir `MPTransaction` a `Pago`, vas a copiar ese mismo bloque.
¿Cuántos lugares van a tener esa lógica de conversión?

🔴 **¿Qué pasa si el SDK cambia?**
Si en la próxima versión `getAmount()` pasa a llamarse `getValue()`,
¿en cuántos lugares tenés que hacer el cambio?

🔴 **¿Es trabajo del cliente saber cómo se convierte una `MPTransaction`?**
El cliente debería simplemente pedir un reporte. No debería conocer
los detalles internos de cómo MercadoPago nombra sus campos.

---