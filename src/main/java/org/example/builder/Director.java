package org.example.builder;

public class Director {
    private final Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void constructBow() {
        this.builder.setDamage(10);
        this.builder.setDurability(5);
        this.builder.setRanged(true);
    }

    public void constructSword() {
        this.builder.setDamage(8);
        this.builder.setDurability(20);
        this.builder.setRanged(false);
    }
}
