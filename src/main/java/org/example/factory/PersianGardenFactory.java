package org.example.factory;

public class PersianGardenFactory extends AbstractFactory {

    @Override
    public AbstractTree createTree() {
        return new Chenar();
    }

    @Override
    public AbstractFlower createFlower() {
        return new Khatmi();
    }
}
