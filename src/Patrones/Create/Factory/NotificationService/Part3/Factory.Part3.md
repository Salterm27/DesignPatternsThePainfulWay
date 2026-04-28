# Factory Pattern - Guia de Practica

## Part 2

El equipo de producto esta entusiasmado con su sistema de notificaciones. Ahora quiern mas:
"Necesitamos soporte para SMS y Push notifications. Los usuarios tienen que poder elegir que tipo enviar. Ah! El proximo trimestre probablemente agregaremos WhatsApp."

### Tu tarea: 
- NO uses ningun patron aun. Resolver de la manera "obvia" 
- Crea 'SMSNotification' y 'PushNotification' (similar a EmailNotification).
- Modifica NotificationService.sendNotification(...) para que el usuario pueda elegir que tipo de notificacion enviar.
- Actualiza el diagrama de clases.

### Cosas a observar (No arreglarlas aun)
1. Donde se encuentra el codigo de SMSNotification / PushNotification?
2. que pasa si el usuario no selecciona ninguna notificacion?
3. que pasa cada vez que se agrega un nuevo tipo de notificacion? Hay que reabrir y modificar OCP (Open/Closed Principle)?
4. Si en una parte diferente del sistema se necesita enviar notificaciones, hay qu erepetir la cadena de if/else?
5. Las firmas del constructor son todas iguales? Que pasa si PushNotification necesita un parametro extra como a que dispositivo enviar la notificacion? Como se manejaria en sendNotification?