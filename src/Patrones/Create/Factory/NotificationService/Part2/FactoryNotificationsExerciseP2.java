package Patrones.Create.Factory.NotificationService.Part2;

import SharedInterfaces.Exercise;

public class FactoryNotificationsExerciseP2 implements Exercise {
    @Override
    public String getName() {
        return "Factory - Parte 2";
    }

    @Override
    public void run() {

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




    }
}
