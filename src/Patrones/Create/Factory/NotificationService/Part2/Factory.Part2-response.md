# Factory Pattern - Guia de Practica

## Part 2
### Cosas a observar (No arreglarlas aun)
1. Donde se encuentra el codigo de SMSNotification / PushNotification? En clases nuevas
2. que pasa si el usuario no selecciona ninguna notificacion? Por defecto lo voy a mandar por email.
3. que pasa cada vez que se agrega un nuevo tipo de notificacion? Hay que reabrir y modificar OCP (Open/Closed Principle)? Si, tengo que ir al Notification Service y agregar un nuevo tipo de notificacion a validar.
4. Si en una parte diferente del sistema se necesita enviar notificaciones, hay qu repetir la cadena de if/else? Tecnicamente no, mientras uses el Notification Service estas bien.
5. Las firmas del constructor son todas iguales? Que pasa si PushNotification necesita un parametro extra como a que dispositivo enviar la notificacion? Como se manejaria en sendNotification? Si, tienen que ser todas iguales, si me pide algo distinto para algun caso particular se rompe.

### Notas de Claude
Lo que duele del código actual
1. Viola OCP (Open/Closed Principle). Cada vez que la empresa agregue un nuevo canal (WhatsApp, Telegram, Slack…), tenés que reabrir NotificationService y agregar otro else if. La clase debería estar cerrada a modificación pero abierta a extensión. Ahora es al revés.
1. NotificationService sabe demasiado. 
   2. Sabe: Que Email, SMS y Push existen. 
   3. Cómo instanciar cada uno (qué constructor, qué argumentos). 
   4. Cuál elegir en base a un string mágico.
Son tres responsabilidades pegadas en una clase cuyo único trabajo real es "enviar una notificación".
5. Strings mágicos. "SMS", "Push", cualquier otra cosa → Email. Si te equivocás y escribís "sms" (minúscula), cae en el branch de email y manda el mensaje incorrecto sin avisar. 
5. La duplicación que aparecería si crece. Imaginate que otra clase — un AlertService o MarketingService — también necesita mandar notificaciones. Va a copiar ese mismo if/else. El día que agreguen WhatsApp, lo arreglás en un lado y te olvidás del otro.
5. Acoplamiento a los constructores. Hoy los tres constructores reciben (destinatario, mensaje). El día que PushNotification necesite un deviceToken, el if/else dentro de sendNotification tiene que crecer con lógica especial para ese caso.