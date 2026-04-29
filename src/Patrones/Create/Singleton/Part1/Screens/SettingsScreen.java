package Patrones.Create.Singleton.Part1.Screens;


import Patrones.Create.Singleton.ConfigManager;

public class SettingsScreen {
    public SettingsScreen() {
    }
    public void cambiarIdioma(ConfigManager myConfig, String idioma) {

        myConfig.setlanguage(idioma);
        System.out.println("Idioma cambiado a " + idioma);
    }
}
