package Patrones.Create.Factory.NotificationService.Part3.NotificationServices;

import Patrones.Create.Factory.NotificationService.Part3.Notificaciones.INotificacion;
import Patrones.Create.Factory.NotificationService.Part3.Notificaciones.PushNotificationP3;
import Patrones.Create.Factory.NotificationService.Part3.NotificationServiceP3;

public class PushNotificationService extends NotificationServiceP3 {

    @Override
    public INotificacion crearNotificacion(String mensaje, String destinatario) {
        return new PushNotificationP3(mensaje,destinatario);
    }
}
