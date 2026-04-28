package Patrones.Create.Factory.NotificationService.Part1;

public class NotificationServiceP1 {
    public void sendNotification(String mensaje , String destinatario) {
        EmailNotificationP1 email = new EmailNotificationP1(destinatario,mensaje); //esta linea es la que genera los dolores de cabeza!
        email.send();
    }

}
