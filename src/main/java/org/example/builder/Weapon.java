package org.example.builder;

public class Weapon {
    private final int damage;
    private final int durability;
    private final boolean ranged;

    public Weapon(int damage, int durability, boolean ranged) {
        this.damage = damage;
        this.durability = durability;
        this.ranged = ranged;
    }

    public int getDamage() {
        return damage;
    }

    public int getDurability() {
        return durability;
    }

    public boolean isRanged() {
        return ranged;
    }
}
