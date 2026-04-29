# Ejercicio Singleton

## 🎯 Paso 1: La versión simple

Estás desarrollando una aplicación que necesita un **gestor de configuración**
(`ConfigManager`). Este objeto guarda parámetros globales de la app, por ejemplo:

- `idioma` (ej: `"es"`)
- `modoOscuro` (ej: `true`)
- `urlServidor` (ej: `"https://api.miapp.com"`)

La app tiene dos pantallas que necesitan leer la configuración:
- `HomeScreen` — al iniciar, imprime el idioma y la URL del servidor.
- `SettingsScreen` — permite cambiar el idioma y el modo oscuro.

---

## Tu tarea

1. Creá la clase `ConfigManager` con los tres atributos mencionados,
   sus getters y un método `setIdioma(String idioma)`.

2. Creá `HomeScreen` con un método `mostrar()` que reciba un `ConfigManager`
   por parámetro e imprima el idioma y la URL del servidor.

3. Creá `SettingsScreen` con un método `cambiarIdioma(String nuevoIdioma)`
   que reciba un `ConfigManager` por parámetro y actualice el idioma.

4. Escribí un cliente que:
    - Cree un `ConfigManager`
    - Lo pase a `HomeScreen` y `SettingsScreen`
    - Cambie el idioma desde `SettingsScreen`
    - Muestre la pantalla de inicio de nuevo para verificar que cambió

5. Hacé el diagrama de clases.