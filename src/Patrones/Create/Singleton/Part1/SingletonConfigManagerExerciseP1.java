package Patrones.Create.Singleton.Part1;

import Patrones.Create.Singleton.Part1.Screens.HomeScreen;
import Patrones.Create.Singleton.Part1.Screens.SettingsScreen;
import SharedInterfaces.Exercise;

public class SingletonConfigManagerExerciseP1 implements Exercise {
    @Override
    public String getName() {
        return "Singleton - Parte 1";
    }

    @Override
    public void run() {
        System.out.println("Ejercicio Singleton - Parte 1");
        ConfigManagerP1 mySettings = new ConfigManagerP1("Español", "Oscuro", "https://api.example.com");
        new HomeScreen().mostrar(mySettings);
        new SettingsScreen().cambiarIdioma(mySettings, "Ingles");
        new HomeScreen().mostrar(mySettings);
    }
}
