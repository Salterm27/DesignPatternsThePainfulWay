package Patrones.Create.AbstractFactory.UICreation.Parte2.Components.MacOS;

import Patrones.Create.AbstractFactory.UICreation.Parte1.Components.IUIComponent;

public class MacOSCheckbox implements IUIComponent {
    @Override
    public void render() {
        System.out.println("MacOSCheckbox");
    }
}
