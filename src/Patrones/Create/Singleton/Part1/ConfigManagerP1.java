package Patrones.Create.Singleton.Part1;

public class ConfigManagerP1 {
    private String language;
    private String theme;
    private String serviceURL;

    public ConfigManagerP1(String language, String theme, String serviceURL) {
        this.language = language;
        this.theme = theme;
        this.serviceURL = serviceURL;
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
