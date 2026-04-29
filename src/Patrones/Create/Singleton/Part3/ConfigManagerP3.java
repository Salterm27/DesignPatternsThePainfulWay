package Patrones.Create.Singleton.Part3;

import Patrones.Create.Singleton.ConfigManager;

public class ConfigManagerP3 extends ConfigManager {
    private static ConfigManagerP3 instance;

    private ConfigManagerP3(String language, String theme, String serviceURL) {
        this.setlanguage(language);
        this.setTheme(theme);
        this.setServiceURL(serviceURL);
    }

    public static ConfigManagerP3 getInstance() {
        if (instance == null) {
            instance = new ConfigManagerP3("es", "light", "https://api.example.com");
        }
        return instance;
    }
}
