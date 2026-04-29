package Patrones.Create.Singleton;

public abstract class ConfigManager {
    protected String language;
    protected String theme;
    protected String serviceURL;

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
