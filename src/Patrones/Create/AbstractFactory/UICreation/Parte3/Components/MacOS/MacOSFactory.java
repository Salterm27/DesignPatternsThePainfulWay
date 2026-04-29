package Patrones.Create.AbstractFactory.UICreation.Parte3.Components.MacOS;

import Patrones.Create.AbstractFactory.UICreation.Parte3.Components.IButton;
import Patrones.Create.AbstractFactory.UICreation.Parte3.Components.ICheckbox;
import Patrones.Create.AbstractFactory.UICreation.Parte3.Components.IUIFactory;

public class MacOSFactory implements IUIFactory {

    @Override
    public IButton createButton() {
        return new MacOSButtonP3();
    }

    @Override
    public ICheckbox createCheckbox() {
        return new MacOSCheckboxP3();
    }
}
