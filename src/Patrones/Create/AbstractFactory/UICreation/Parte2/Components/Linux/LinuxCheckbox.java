package Patrones.Create.AbstractFactory.UICreation.Parte2.Components.Linux;

import Patrones.Create.AbstractFactory.UICreation.Parte1.Components.IUIComponent;

public class LinuxCheckbox implements IUIComponent {
    @Override
    public void render() {
        System.out.println("WindowsCheckbox");
    }
}
