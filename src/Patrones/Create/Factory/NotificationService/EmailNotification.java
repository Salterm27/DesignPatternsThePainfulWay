package Patrones.Create.Factory.NotificationService;

public class EmailNotification {
    private String destinatario;
    private String mensaje;

    public EmailNotification(String destinatario, String mensaje) {
        this.destinatario = destinatario;
        this.mensaje = mensaje;
    }
    public void send() {
        System.out.println("Enviando una notification a " + destinatario + " con el mensaje: " + mensaje);
    }
}
