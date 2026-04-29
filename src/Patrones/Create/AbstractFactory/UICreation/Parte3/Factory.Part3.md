# Ejercicio 2 — Abstract Factory

## 🎯 Paso 3: Refactor con Abstract Factory

Ahora viene la parte satisfactoria. Vas a refactorizar el código del Paso 2 aplicando el patrón **Abstract Factory**.

---

## La idea central del patrón

> En lugar de que `Application` sepa cómo construir cada componente para cada plataforma,
> **delegás toda esa responsabilidad a una fábrica**.
> La fábrica garantiza que todos los productos que crea pertenecen a la misma familia.

**La promesa del patrón:** si el compilador te deja instanciar una `MacFactory`, es **imposible** que te devuelva un `WindowsCheckbox`. La consistencia entre familias deja de ser un problema de disciplina y pasa a ser una garantía del sistema de tipos.

---

## Tu tarea

1. Crear las interfaces de producto, checkbox y button

> ⚠️ **¿Por qué dos interfaces y no una?**  
> Porque el cliente necesita poder distinguir tipos. En un sistema real,
> `IButton` podría tener `onClick()` e `ICheckbox` podría tener `isChecked()`.
> Si todo es `IUIComponent`, perdés esa especificidad.

2. Hacé que tus clases concretas existentes (`WindowsButton`, `MacOSButton`, etc.) implementen la interfaz que les corresponde.

2. Crear la Abstract Factory
Esta interfaz es el **contrato de la familia**. Cualquier clase que la implemente está prometiendo: *"yo te doy un botón y un checkbox que son coherentes entre sí"*.

3. Crear las Concrete Factories, una por cada plataforma.

4. Refactorizar `MyDesktopApplication`

Esta es la transformación más importante. La clase ya **no recibe un String**.  
Recibe directamente una `UIFactory`:

## Preguntas para responder cuando me pegues el código

1. ¿Qué pasa si querés agregar soporte para Android?
   ¿Cuántas clases existentes tenés que modificar?  
   ¿Cuántas clases nuevas tenés que crear?

2. ¿Es posible ahora mezclar un `WindowsButton` con un `MacOSCheckbox` sin querer?
   ¿Por qué sí o por qué no?

3. ¿Dónde vive ahora el conocimiento de "qué clases son familia Windows"?  
   ¿Está en el código cliente, o en otro lado?

4. ¿Qué diferencia hay con el Factory Method del ejercicio anterior?
   Pensá en términos de: ¿cuántos productos crea cada patrón?
