package Patrones.Create.Factory.NotificationService.Part3.Notificaciones;

public class EmailNotificationP3 implements INotificacion{
    private String destinatario;
    private String mensaje;

    public EmailNotificationP3(String mensaje, String destinatario) {
        this.destinatario = destinatario;
        this.mensaje = mensaje;
    }
    public void send() {
        System.out.println("Enviando una notification via email a " + destinatario + " con el mensaje: " + mensaje);
    }
}
