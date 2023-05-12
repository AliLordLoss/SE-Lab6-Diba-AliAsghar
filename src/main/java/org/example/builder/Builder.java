package org.example.builder;

public class Builder {
    private int damage;
    private int durability;
    private boolean ranged;

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setDurability(int durability) {
        this.durability = durability;
    }

    public void setRanged(boolean ranged) {
        this.ranged = ranged;
    }

    public Weapon getResult() {
        return new Weapon(damage, durability, ranged);
    }
}
