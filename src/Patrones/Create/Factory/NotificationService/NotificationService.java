package Patrones.Create.Factory.NotificationService;

public class NotificationService {
    public void sendNotification(String mensaje , String destinatario) {
        EmailNotification email = new EmailNotification(destinatario,mensaje); //esta linea es la que genera los dolores de cabeza!
        email.send();
    }

}
