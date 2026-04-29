package Patrones.Create.AbstractFactory.UICreation.Parte3.Components.Windows;

import Patrones.Create.AbstractFactory.UICreation.Parte3.Components.IButton;
import Patrones.Create.AbstractFactory.UICreation.Parte3.Components.ICheckbox;
import Patrones.Create.AbstractFactory.UICreation.Parte3.Components.UIFactory;

public class WindowsFactory extends UIFactory {

    @Override
    public IButton createButton() {
        return new WindowsButtonP3();
    }

    @Override
    public ICheckbox createCheckbox() {
        return new WindowsCheckboxP3();
    }
}