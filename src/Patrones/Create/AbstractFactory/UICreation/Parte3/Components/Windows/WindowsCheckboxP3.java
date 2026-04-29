package Patrones.Create.AbstractFactory.UICreation.Parte3.Components.Windows;

import Patrones.Create.AbstractFactory.UICreation.Parte3.Components.ICheckbox;

public class WindowsCheckboxP3 implements ICheckbox {
    @Override
    public void render() {
        System.out.println("WindowsCheckbox");
    }
}
