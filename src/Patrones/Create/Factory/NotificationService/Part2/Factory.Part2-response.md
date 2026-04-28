# Factory Pattern - Guia de Practica

## Part 2
### Cosas a observar (No arreglarlas aun)
1. Donde se encuentra el codigo de SMSNotification / PushNotification? En clases nuevas
2. que pasa si el usuario no selecciona ninguna notificacion? Por defecto lo voy a mandar por email.
3. que pasa cada vez que se agrega un nuevo tipo de notificacion? Hay que reabrir y modificar OCP (Open/Closed Principle)? Si, tengo que ir al Notification Service y agregar un nuevo tipo de notificacion a validar.
4. Si en una parte diferente del sistema se necesita enviar notificaciones, hay qu repetir la cadena de if/else? Tecnicamente no, mientras uses el Notification Service estas bien.
5. Las firmas del constructor son todas iguales? Que pasa si PushNotification necesita un parametro extra como a que dispositivo enviar la notificacion? Como se manejaria en sendNotification? Si, tienen que ser todas iguales, si me pide algo distinto para algun caso particular se rompe.