package Patrones.Create.Factory.NotificationService.Part3;

import Patrones.Create.Factory.NotificationService.Part3.Notificaciones.EmailNotificationP3;
import Patrones.Create.Factory.NotificationService.Part3.Notificaciones.INotificacion;
import Patrones.Create.Factory.NotificationService.Part3.Notificaciones.PushNotificationP3;
import Patrones.Create.Factory.NotificationService.Part3.Notificaciones.SMSNotificationP3;

public abstract class NotificationServiceP3 {

    public abstract INotificacion crearNotificacion(String mensaje , String destinatario);
    public void sendNotification(String mensaje , String destinatario) {
        INotificacion notificacion = crearNotificacion(mensaje,destinatario);
        notificacion.send();
    }
}
