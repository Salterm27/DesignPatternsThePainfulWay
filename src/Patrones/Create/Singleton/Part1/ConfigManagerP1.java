package Patrones.Create.Singleton.Part1;

import Patrones.Create.Singleton.ConfigManager;

public class ConfigManagerP1 extends ConfigManager {
    public ConfigManagerP1(String myLanguage, String myTheme, String myServiceURL) {
        this.language = myLanguage;
        this.theme = myTheme;
        this.serviceURL = myServiceURL;
    }

}
