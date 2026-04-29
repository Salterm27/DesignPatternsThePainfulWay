package Patrones.Create.AbstractFactory.UICreation.Parte3.Components.Windows;

import Patrones.Create.AbstractFactory.UICreation.Parte3.Components.IButton;

public class WindowsButtonP3 implements IButton {
    @Override
    public void render() {
        System.out.println("WindowsButton");
    }
}
