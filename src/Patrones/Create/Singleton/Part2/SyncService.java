package Patrones.Create.Singleton.Part2;


import Patrones.Create.Singleton.ConfigManager;

public class SyncService {
    public void sync(ConfigManager myConfig) {
        System.out.println("Sincronizando con URL " + myConfig.getServiceURL());
    }
}
