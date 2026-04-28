package Patrones.Create.Factory.NotificationService.Part2.Notificaciones;

public class EmailNotificationP2 {
    private String destinatario;
    private String mensaje;

    public EmailNotificationP2(String destinatario, String mensaje) {
        this.destinatario = destinatario;
        this.mensaje = mensaje;
    }
    public void send() {
        System.out.println("Enviando una notification via email a " + destinatario + " con el mensaje: " + mensaje);
    }
}
