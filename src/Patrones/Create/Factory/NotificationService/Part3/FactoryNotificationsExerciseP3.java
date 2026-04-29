package Patrones.Create.Factory.NotificationService.Part3;

import Patrones.Create.Factory.NotificationService.Part3.NotificationServices.EmailNotificationService;
import Patrones.Create.Factory.NotificationService.Part3.NotificationServices.SMSNotificationService;
import SharedInterfaces.Exercise;

public class FactoryNotificationsExerciseP3 implements Exercise {
    @Override
    public String getName() {
        return "Factory - Parte 1";
    }

    @Override
    public void run() {

        System.out.println("Ejercicio Factory - Parte 3");
        System.out.println("----------------------------------------");
        NotificationServiceP3 notificador5 = new SMSNotificationService();
        notificador5.sendNotification("Hola mundo", "Amigo");
        System.out.println("----------------------------------------");
        notificador5 = new EmailNotificationService();
        notificador5.sendNotification("Hola mundo", "Amigo");
        System.out.println("----------------------------------------");


    }
}
