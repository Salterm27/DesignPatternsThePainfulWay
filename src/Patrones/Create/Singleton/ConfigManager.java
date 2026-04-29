package Patrones.Create.Singleton;

public abstract class ConfigManager {
    private String language;
    private String theme;
    private String serviceURL;
    protected ConfigManager() {}
    public void setlanguage(String language) {
        this.language = language;
    }
    public void setTheme(String theme) {
        this.theme = theme;
    }
    public void setConfig(String language, String theme, String serviceURL) {
        this.language = language;
    }
    public void setServiceURL(String serviceURL) {
        this.serviceURL = serviceURL;
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
