# Factory Pattern - Guia de Practica

## Part 3
### Cosas a observar (No arreglarlas aun)
1. ¿Dónde vive ahora la decisión de "qué tipo de notificación"?
👉 Vive en el cliente, en el momento de elegir qué NotificationService instanciar. Una vez elegido, nadie más toma esa decisión. La decisión se tomó una sola vez en lugar de en cada llamada.
2. Para agregar WhatsApp, ¿cuántas clases modificás vs. cuántas agregás?
👉 Modificás: 0. Agregás: 2 (WhatsAppNotification que implementa INotificacion, y WhatsAppNotificationService que extiende NotificationServiceP3). Eso es exactamente OCP en acción: abierto a extensión, cerrado a modificación.