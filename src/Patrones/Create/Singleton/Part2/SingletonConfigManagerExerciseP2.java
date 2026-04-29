package Patrones.Create.Singleton.Part2;

import Patrones.Create.Singleton.Part1.ConfigManagerP1;
import Patrones.Create.Singleton.Part1.Screens.HomeScreen;
import Patrones.Create.Singleton.Part1.Screens.SettingsScreen;
import SharedInterfaces.Exercise;

public class SingletonConfigManagerExerciseP2 implements Exercise {
    @Override
    public String getName() {
        return "Singleton - Parte 2";
    }

    @Override
    public void run() {
        System.out.println("Ejercicio Singleton - Parte 2");
        // Módulo A: HomeScreen crea su propio ConfigManager
        ConfigManagerP1 configHome = new ConfigManagerP1("es", "light", "https://api.miapp.com");
        HomeScreen home = new HomeScreen();
        home.mostrar(configHome);

        // Módulo B, usado mas adelante en SettingsScreen crea el suyo
        ConfigManagerP1 configSettings = new ConfigManagerP1("es", "light", "https://api.miapp.com");
        SettingsScreen settings = new SettingsScreen();
        settings.cambiarIdioma(configSettings, "en");  // el usuario cambió el idioma a inglés

        // Módulo C: SyncService usado al terminar la secuencia, crea el suyo
        ConfigManagerP1 configSync = new ConfigManagerP1("es", "light", "https://api.miapp.com");
        SyncService sync = new SyncService();
        sync.sync(configSync);

        home.mostrar(configHome);
    }
}
