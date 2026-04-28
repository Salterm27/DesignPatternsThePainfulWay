package Patrones.Create.Factory.NotificationService.Part2.Notificaciones;

public class PushNotificationP2 {
    private String destinatario;
    private String mensaje;

    public PushNotificationP2(String destinatario, String mensaje) {
        this.destinatario = destinatario;
        this.mensaje = mensaje;
    }
    public void send() {
        System.out.println("Enviando una notification via Push a " + destinatario + " con el mensaje: " + mensaje);
    }
}
