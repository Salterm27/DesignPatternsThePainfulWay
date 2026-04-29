package Patrones.Create.Singleton.Part1.Screens;

import Patrones.Create.Singleton.Part1.ConfigManagerP1;

public class HomeScreen {
    public void mostrar(ConfigManagerP1 myConfig){
        System.out.println("HomeScreen - mostrarHome");
        System.out.println("El idioma es " + myConfig.getLanguage() );
        System.out.println("El Service URL es " + myConfig.getServiceURL());
    }
}
