package Patrones.Create.AbstractFactory.UICreation.Parte2;

import Patrones.Create.AbstractFactory.UICreation.Parte1.Components.WindowsButton;
import Patrones.Create.AbstractFactory.UICreation.Parte1.Components.WindowsCheckbox;
import Patrones.Create.AbstractFactory.UICreation.Parte2.Components.Linux.LinuxButton;
import Patrones.Create.AbstractFactory.UICreation.Parte2.Components.Linux.LinuxCheckbox;
import Patrones.Create.AbstractFactory.UICreation.Parte2.Components.MacOS.MacOSButton;
import Patrones.Create.AbstractFactory.UICreation.Parte2.Components.MacOS.MacOSCheckbox;

public class MyDesktopApplicationP2 {
    public void renderUI(String platform) {
        switch (platform) {
            case "Windows" -> {
                new WindowsButton().render();
                new WindowsCheckbox().render();
            }
            case "Linux" -> {
                new LinuxButton().render();
                new LinuxCheckbox().render();
            }
            case "MacOS" -> {
                new MacOSButton().render();
                new MacOSCheckbox().render();
            }
        }
    }
}
