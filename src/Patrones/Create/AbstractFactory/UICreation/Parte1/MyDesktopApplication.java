package Patrones.Create.AbstractFactory.UICreation.Parte1;

import Patrones.Create.AbstractFactory.UICreation.Parte1.Components.WindowsButton;
import Patrones.Create.AbstractFactory.UICreation.Parte1.Components.WindowsCheckbox;

public class MyDesktopApplication {
    public void renderUI() {
        WindowsButton button = new WindowsButton();
        WindowsCheckbox checkbox = new WindowsCheckbox();
        button.render();
        checkbox.render();
    }
}
