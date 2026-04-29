# Ejercicio 2 — Abstract Factory

## 🎯 Paso 1: La versión simple

Estás desarrollando una **aplicación de escritorio multiplataforma** (estilo Slack, Discord, etc.). Por ahora solo corre en **Windows**.

La aplicación tiene una pantalla principal que necesita renderizar dos componentes de UI:

- Un **botón** (`Button`)
- Un **checkbox** (`Checkbox`)

Ambos componentes tienen estilo Windows.

---

## Tu tarea

1. Creá las clases `WindowsButton` y `WindowsCheckbox`. Cada una con un método `render()` que imprima algo como `"Renderizando botón estilo Windows"`.

2. Creá una clase `Application` que tenga un método `renderUI()`. Adentro, instancia un `WindowsButton` y un `WindowsCheckbox` y llama al `render()` de cada uno.

3. Hacé el diagrama de clases (texto, Mermaid o como prefieras).

---