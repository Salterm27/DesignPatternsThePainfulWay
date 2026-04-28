package Patrones.Create.Factory.NotificationService;

import Patrones.Create.Factory.NotificationService.Part1.NotificationServiceP1;
import Patrones.Create.Factory.NotificationService.Part2.NotificationServiceP2;
import Patrones.Create.Factory.NotificationService.Part3.NotificationServiceP3;
import Patrones.Create.Factory.NotificationService.Part3.NotificationServices.SMSNotificationService;
import SharedInterfaces.Exercise;

public class FactoryNotificationsExercise implements Exercise {
    @Override
    public String getName() {
        return "Factory - Parte 1";
    }

    @Override
    public void run() {
        System.out.println("Ejercicio Factory - Parte 1");
        NotificationServiceP1 notificador = new NotificationServiceP1();
        notificador.sendNotification("Hola mundo", "Amigo");
        System.out.println("----------------------------------------");
        System.out.println("----------------------------------------");
        System.out.println("Ejercicio Factory - Parte 2");
        System.out.println("----------------------------------------");
        NotificationServiceP2 notificador2 = new NotificationServiceP2();
        String MetodoNotificacion = "SMS";
        notificador2.sendNotification("Hola mundo", "Amigo", MetodoNotificacion);
        System.out.println("----------------------------------------");
        MetodoNotificacion = "Push";
        NotificationServiceP2 notificador3 = new NotificationServiceP2();
        notificador3.sendNotification("Hola mundo", "Amigo", MetodoNotificacion);
        System.out.println("----------------------------------------");
        MetodoNotificacion = "Email";
        NotificationServiceP2 notificador4 = new NotificationServiceP2();
        notificador4.sendNotification("Hola mundo", "Amigo", MetodoNotificacion);
        System.out.println("----------------------------------------");
        System.out.println("----------------------------------------");
        System.out.println("----------------------------------------");
        System.out.println("Ejercicio Factory - Parte 3");
        System.out.println("----------------------------------------");
        NotificationServiceP3 notificador5 = new SMSNotificationService();
        notificador5.sendNotification("Hola mundo", "Amigo");



    }
}
