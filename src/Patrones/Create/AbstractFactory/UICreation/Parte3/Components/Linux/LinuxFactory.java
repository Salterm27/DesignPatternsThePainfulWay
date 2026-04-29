package Patrones.Create.AbstractFactory.UICreation.Parte3.Components.Linux;

import Patrones.Create.AbstractFactory.UICreation.Parte3.Components.IButton;
import Patrones.Create.AbstractFactory.UICreation.Parte3.Components.ICheckbox;
import Patrones.Create.AbstractFactory.UICreation.Parte3.Components.IUIFactory;

public class LinuxFactory implements IUIFactory {

    @Override
    public IButton createButton() {
        return new LinuxButtonP3();
    }

    @Override
    public ICheckbox createCheckbox() {
        return new LinuxCheckboxP3();
    }
}
