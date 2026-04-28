package Patrones.Create.Factory.NotificationService.Part3.NotificationServices;

import Patrones.Create.Factory.NotificationService.Part3.Notificaciones.INotificacion;
import Patrones.Create.Factory.NotificationService.Part3.Notificaciones.SMSNotificationP3;
import Patrones.Create.Factory.NotificationService.Part3.NotificationServiceP3;

public class SMSNotificationService extends NotificationServiceP3 {
    @Override
    public INotificacion crearNotificacion(String mensaje, String destinatario) {
        return new SMSNotificationP3(mensaje,destinatario);
    }
}
