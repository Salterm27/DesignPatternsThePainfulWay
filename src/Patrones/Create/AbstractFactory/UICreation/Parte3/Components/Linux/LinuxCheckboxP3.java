package Patrones.Create.AbstractFactory.UICreation.Parte3.Components.Linux;

import Patrones.Create.AbstractFactory.UICreation.Parte3.Components.ICheckbox;

public class LinuxCheckboxP3 implements ICheckbox {
    @Override
    public void render() {
        System.out.println("WindowsCheckbox");
    }
}
