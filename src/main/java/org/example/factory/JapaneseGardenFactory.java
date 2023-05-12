package org.example.factory;

public class JapaneseGardenFactory extends AbstractGardenFactory {
    @Override
    public AbstractTree createTree() {
        return new Maple();
    }

    @Override
    public AbstractFlower createFlower() {
        return new Sakura();
    }
}
