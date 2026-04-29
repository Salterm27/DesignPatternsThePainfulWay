# Ejercicio 2 — Abstract Factory

## 🎯 Paso 2: La curva — agregar familias de productos

El equipo de producto te trae la nueva épica:

> "La aplicación tiene que correr también en **macOS** y en **Linux**. Cada plataforma tiene su propio estilo visual nativo para botones y checkboxes. El usuario tiene que poder elegir el tema al iniciar la app."

Importante: **un usuario en Windows quiere TODO con estilo Windows.** No tiene sentido mezclar un `WindowsButton` con un `MacCheckbox` — se vería horrible y rompería la coherencia visual. Esto es lo que se llama una **familia de productos**.

---

## Tu tarea (sin patrones todavía)

1. Creá las nuevas clases concretas:
    - `MacButton`, `MacCheckbox`
    - `LinuxButton`, `LinuxCheckbox`

   Cada una con su `render()` que imprima algo como `"Renderizando botón estilo Mac"`.

2. Modificá `MyDesktopApplication` para que reciba un parámetro `String tema` (o `String SO`) en el método `renderUI(...)`. Adentro, usá un `if/else` o `switch` para decidir qué clases instanciar según el tema.

3. Asegurate de que **nunca se pueda mezclar familias**: si el tema es `"Mac"`, ambos componentes (botón y checkbox) tienen que ser de Mac. Esto lo vas a tener que controlar manualmente con la cadena de if/else.

4. Actualizá el diagrama de clases.

---

## Cosas para sentir mientras lo hacés (no las arregles, solo notalas)

🔴 **El problema de la consistencia entre familias.**  
Si te equivocás y escribís:

```java
if (tema.equals("Mac")) {
    button = new MacButton();
    checkbox = new WindowsCheckbox();  // ← typo, pero el código compila
}
```

…el código compila perfecto. Compila, corre, y muestra una UI inconsistente. **El compilador no te puede ayudar** porque las clases no tienen ninguna relación entre sí que indique que pertenecen a la misma familia.

🔴 **El crecimiento del if/else cuando hay más productos.**  
Hoy tenés 2 productos (Button, Checkbox). Imaginate que mañana agregan `TextField`, `Slider`, `Menu`, `Dialog`. El `renderUI` se va a llenar de líneas tipo:

```java
if (tema.equals("Windows")) {
    button = new WindowsButton();
    checkbox = new WindowsCheckbox();
    textField = new WindowsTextField();
    slider = new WindowsSlider();
    // ... etc
} else if (tema.equals("Mac")) {
    button = new MacButton();
    checkbox = new MacCheckbox();
    // ... 4 líneas más, igualitas pero con "Mac"
}
```

🔴 **La duplicación entre clientes.**  
Si otra clase también necesita renderizar UI (un `SettingsDialog`, un `LoginScreen`), va a copiar la misma cadena de if/else. El día que agreguen un tema nuevo (`"Android"`), tenés que actualizar todos esos lugares.

🔴 **Cómo agregar un sistema operativo nuevo.**  
Si mañana piden soporte para Android, ¿cuántos lugares tenés que tocar? Contalos.

---

## Preguntas para responder cuando me pegues el código

1. ¿Dónde vive el conocimiento de "qué clases pertenecen a la familia Windows"? ¿Está documentado, o solo existe en tu cabeza y en las cadenas de if/else?

2. Si te dieran 1 minuto para leer el `renderUI` de un compañero, ¿podrías garantizar que **nunca** mezcla familias?

3. ¿Qué pasa si necesitás cambiar el tema **mientras la app está corriendo** (sin reiniciar)?

---

## Pista

No uses Factory Method del ejercicio anterior. Resolvé esto **a lo bruto, con if/else encadenados**, igual que hiciste en el Paso 2 del ejercicio de notificaciones. La idea es que sientas el dolor de manejar **dos productos** que tienen que estar coordinados, no uno solo.

Cuando lo tengas, me lo pasás y vemos las preguntas.