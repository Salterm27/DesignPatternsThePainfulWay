package Patrones.Create.Factory.NotificationService.Part1;

public class EmailNotificationP1 {
    private String destinatario;
    private String mensaje;

    public EmailNotificationP1(String destinatario, String mensaje) {
        this.destinatario = destinatario;
        this.mensaje = mensaje;
    }
    public void send() {
        System.out.println("Enviando una notification a " + destinatario + " con el mensaje: " + mensaje);
    }
}
