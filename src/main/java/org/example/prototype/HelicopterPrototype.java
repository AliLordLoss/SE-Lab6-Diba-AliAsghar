package org.example.prototype;

public class HelicopterPrototype extends Prototype {
    private final String name;
    public HelicopterPrototype(String name) {
        this.name = name;
    }

    @Override
    public Prototype clone() {
        return new HelicopterPrototype(this.name);
    }

    @Override
    public String getName() {
        return this.name;
    }
}
