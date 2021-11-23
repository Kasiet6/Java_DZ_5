package com.company;

public class Boss {
    private int health;
    private int damage;
    private String defence;

    public Boss(int health, int damage, String defence) {

        this.health = health;
        this.damage = damage;
        this.defence = defence;
    }

    public Boss() {
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getDefence() {
        return defence;
    }

    public void setDefence(String defence) {
        this.defence = defence;
    }
}
