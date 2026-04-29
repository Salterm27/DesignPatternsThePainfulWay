package Patrones.Create.AbstractFactory.UICreation.Parte3.Components.MacOS;

import Patrones.Create.AbstractFactory.UICreation.Parte3.Components.IButton;

public class MacOSButtonP3 implements IButton {
    @Override
    public void render() {
        System.out.println("MacOSButton");
    }
}
