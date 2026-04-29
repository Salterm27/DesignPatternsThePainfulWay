package Patrones.Create.Factory.NotificationService.Part1;

import SharedInterfaces.Exercise;

public class FactoryNotificationsExerciseP1 implements Exercise {
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




    }
}
