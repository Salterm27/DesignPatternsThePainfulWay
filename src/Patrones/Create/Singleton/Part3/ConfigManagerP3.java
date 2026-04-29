package Patrones.Create.Singleton.Part3;

import Patrones.Create.Singleton.ConfigManager;

public class ConfigManagerP3 extends ConfigManager {
    private static ConfigManagerP3 instance;

    private ConfigManagerP3(String language, String theme, String serviceURL) {
        this.language = language;
        this.theme = theme;
        this.serviceURL = serviceURL;
    }

    public static ConfigManagerP3 getInstance() {
        if (instance == null) {
            instance = new ConfigManagerP3("es", "light", "https://api.example.com");
        }
        return instance;
    }

    public void setlanguage(String language) {
        this.language = language;
    }
    public String getLanguage() {
        return language;
    }
    public String getTheme() {
        return theme;
    }
    public String getServiceURL() {
        return serviceURL;
    }
}
