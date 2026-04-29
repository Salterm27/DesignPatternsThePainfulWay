package Patrones.Create.AbstractFactory.UICreation.Parte3;

import Patrones.Create.AbstractFactory.UICreation.Parte3.Components.UIFactory;

public class MyDesktopApplicationP3 {
    public void renderUI(UIFactory factory) {
        factory.createButton().render();
        factory.createCheckbox().render();
    }
}
