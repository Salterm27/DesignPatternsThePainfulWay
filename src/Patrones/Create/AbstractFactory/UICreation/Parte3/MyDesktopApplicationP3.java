package Patrones.Create.AbstractFactory.UICreation.Parte3;

import Patrones.Create.AbstractFactory.UICreation.Parte3.Components.IUIFactory;

public class MyDesktopApplicationP3 {
    private IUIFactory factory;

    public MyDesktopApplicationP3(IUIFactory factory) {
        this.factory = factory;
    }
    public void renderUI() {
        factory.createButton().render();
        factory.createCheckbox().render();
    }
}
