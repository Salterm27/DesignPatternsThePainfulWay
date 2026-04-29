package Patrones.Create.AbstractFactory.UICreation.Parte3.Components.Linux;

import Patrones.Create.AbstractFactory.UICreation.Parte3.Components.IButton;
import Patrones.Create.AbstractFactory.UICreation.Parte3.Components.ICheckbox;
import Patrones.Create.AbstractFactory.UICreation.Parte3.Components.UIFactory;

public class LinuxFactory extends UIFactory {

    @Override
    public IButton createButton() {
        return new LinuxButtonP3();
    }

    @Override
    public ICheckbox createCheckbox() {
        return new LinuxCheckboxP3();
    }
}
