package Patrones.Create.AbstractFactory.UICreation.Parte3.Components.Linux;

import Patrones.Create.AbstractFactory.UICreation.Parte3.Components.IButton;

public class LinuxButtonP3 implements IButton {
    @Override
    public void render() {
        System.out.println("LinuxButton");
    }
}
