package Patrones.Create.AbstractFactory.UICreation.Parte3;

import Patrones.Create.AbstractFactory.UICreation.Parte3.Components.IUIFactory;

public class MyDesktopApplicationP3 {
    public void renderUI(IUIFactory factory) {
        factory.createButton().render();
        factory.createCheckbox().render();
    }
}
