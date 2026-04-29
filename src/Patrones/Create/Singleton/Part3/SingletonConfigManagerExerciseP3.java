package Patrones.Create.Singleton.Part3;

import Patrones.Create.Singleton.Part1.Screens.HomeScreen;
import Patrones.Create.Singleton.Part1.Screens.SettingsScreen;
import Patrones.Create.Singleton.Part2.SyncService;
import SharedInterfaces.Exercise;

public class SingletonConfigManagerExerciseP3 implements Exercise {
    @Override
    public String getName() {
        return "Singleton - Parte 2";
    }

    @Override
    public void run() {


        System.out.println("Ejercicio Singleton - Parte 2");
        // Módulo A: HomeScreen crea su propio ConfigManager
        HomeScreen home = new HomeScreen();
        home.mostrar(ConfigManagerP3.getInstance());

        // Módulo B, usado mas adelante en SettingsScreen crea el suyo
        SettingsScreen settings = new SettingsScreen();
        settings.cambiarIdioma(ConfigManagerP3.getInstance(), "en");  // el usuario cambió el idioma a inglés

        // Módulo C: SyncService usado al terminar la secuencia, crea el suyo
        SyncService sync = new SyncService();
        sync.sync(ConfigManagerP3.getInstance());

        home.mostrar(ConfigManagerP3.getInstance());
    }
}
