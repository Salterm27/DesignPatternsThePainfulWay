package Patrones.Create.Factory.NotificationService.Part2;

import Patrones.Create.Factory.NotificationService.Part2.Notificaciones.EmailNotificationP2;
import Patrones.Create.Factory.NotificationService.Part2.Notificaciones.PushNotificationP2;
import Patrones.Create.Factory.NotificationService.Part2.Notificaciones.SMSNotificationP2;

public class NotificationServiceP2 {
    public void sendNotification(String mensaje , String destinatario, String MetodoNotificacion) {
        if(MetodoNotificacion.equals("SMS")) {
            SMSNotificationP2 sms = new SMSNotificationP2(destinatario,mensaje);
            sms.send();

        } else if (MetodoNotificacion.equals("Push")) {
            PushNotificationP2 push = new PushNotificationP2(destinatario,mensaje);
            push.send();

        }else {
            EmailNotificationP2 email = new EmailNotificationP2(destinatario, mensaje); //esta linea es la que genera los dolores de cabeza!
            email.send();
        }
    }

}
