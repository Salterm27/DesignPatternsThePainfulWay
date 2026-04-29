# Factory Pattern - Guia de Practica

## Part 1
Estas construyendo un sistema de notificaciones para una app. Por ahora, el unico tipo de notificaciones es email.

El sistema tiene una classe `NotificationService`con un metodo `sendNotification(message: String, recipient: String)`. Internamente debe crear un objeto `EmailNotification` y llamar su metodo `send()`.

**Tu Tarea:**

- Escribir las clases (`NotificationService`, `EmailNotification`) — Lo minimo para que el ejemplo funcione, imprimiendo por pantalla. Sencillo y sin patrones. 
- Hacer el diagrama de clases (texto, Mermaid, or describirlo it — lo que perfieras).