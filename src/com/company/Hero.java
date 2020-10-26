package com.company;

public class Hero {
    private int health;
    private int damage;
    private String skill;

    public Hero(int health, int damage, String skill) {
        this.health = health;
        this.damage = damage;
        this.skill = skill;
    }

    public Hero(int health, String skill) {
        this.health = health;
        this.skill = skill;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public String getSkill() {
        return skill;
    }
}
