package org.example.factory;

public class PersianGardenFactory extends AbstractGardenFactory {

    @Override
    public AbstractTree createTree() {
        return new Chenar();
    }

    @Override
    public AbstractFlower createFlower() {
        return new Khatmi();
    }
}
