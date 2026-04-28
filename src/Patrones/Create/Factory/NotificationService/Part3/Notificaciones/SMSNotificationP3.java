package Patrones.Create.Factory.NotificationService.Part3.Notificaciones;

public class SMSNotificationP3 implements INotificacion{
    private String destinatario;
    private String mensaje;

    public SMSNotificationP3(String mensaje, String destinatario) {
        this.destinatario = destinatario;
        this.mensaje = mensaje;
    }
    public void send() {
        System.out.println("Enviando una notification via SMS a " + destinatario + " con el mensaje: " + mensaje);
    }
}
