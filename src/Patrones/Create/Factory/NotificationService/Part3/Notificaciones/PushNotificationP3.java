package Patrones.Create.Factory.NotificationService.Part3.Notificaciones;

public class PushNotificationP3 implements INotificacion{
    private String destinatario;
    private String mensaje;

    public PushNotificationP3(String mensaje, String destinatario) {
        this.destinatario = destinatario;
        this.mensaje = mensaje;
    }
    public void send() {
        System.out.println("Enviando una notification via Push a " + destinatario + " con el mensaje: " + mensaje);
    }
}
