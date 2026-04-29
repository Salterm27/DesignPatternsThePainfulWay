package Patrones.Create.Singleton.Part2;

import Patrones.Create.Singleton.Part1.ConfigManagerP1;

public class SyncService {
    public void sync(ConfigManagerP1 myConfig) {
        System.out.println("Sincronizando con URL " + myConfig.getServiceURL());
    }
}
