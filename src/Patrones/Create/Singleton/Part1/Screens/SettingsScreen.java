package Patrones.Create.Singleton.Part1.Screens;

import Patrones.Create.Singleton.Part1.ConfigManagerP1;

public class SettingsScreen {
    public SettingsScreen() {
    }
    public void cambiarIdioma(ConfigManagerP1 myConfig, String idioma) {

        myConfig.setlanguage(idioma);
        System.out.println("Idioma cambiado a " + idioma);
    }
}
