package Patrones.Create.Factory.NotificationService;

import SharedInterfaces.Exercise;

public class FactoryNotificationsExercise implements Exercise {
    @Override
    public String getName() {
        return "Factory - Parte 1";
    }

    @Override
    public void run() {
        System.out.println("Ejercicio Factory - Parte 1");
        NotificationService notificador = new NotificationService();
        notificador.sendNotification("Hola mundo", "Amigo");
    }
}
