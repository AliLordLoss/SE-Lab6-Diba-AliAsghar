package org.example.prototype;

public class PlanePrototype extends Prototype {
    private final String name;

    public PlanePrototype(String name) {
        this.name = name;
    }

    @Override
    public PlanePrototype clone() {
        return new PlanePrototype(this.name);
    }

    @Override
    public String getName() {
        return name;
    }
}
