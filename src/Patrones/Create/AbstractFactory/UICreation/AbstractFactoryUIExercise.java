package Patrones.Create.AbstractFactory.UICreation;

import Patrones.Create.Factory.NotificationService.Part1.NotificationServiceP1;
import Patrones.Create.Factory.NotificationService.Part2.NotificationServiceP2;
import Patrones.Create.Factory.NotificationService.Part3.NotificationServiceP3;
import Patrones.Create.Factory.NotificationService.Part3.NotificationServices.SMSNotificationService;
import SharedInterfaces.Exercise;

public class AbstractFactoryUIExercise implements Exercise {
    @Override
    public String getName() {
        return "Abstract Factory - Parte 1";
    }

    @Override
    public void run() {
        System.out.println("Ejercicio Factory - Parte 1");

    }
}
