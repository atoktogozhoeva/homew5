package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(1000);
        boss.setDamage(250);
        boss.setDefenseType("Physical");
        System.out.println("boss health = " + boss.getHealth() +"\nboss damage = " + boss.getDamage() +"\nboss set Defense = " +boss.getDefenseType());
        for (int i = 0; i < createHeroes().length; i++) {
            System.out.println("___________________________");
            System.out.println("Hero" + i + ":");
            System.out.println("health = " + createHeroes()[i].getHealth());
            System.out.println("damage = " + createHeroes()[i].getDamage());
            System.out.println("superSkill= " + createHeroes()[i].getSkill());
        }
    }
    public static Hero[] createHeroes() {
        Hero magic = new Hero(150, 30, "Magical");
        Hero berserk = new Hero(200, 25, "Warrior");
        Hero warrior = new Hero(250, 35, "Physical");
        return new Hero[]{magic,warrior,berserk,};
    }
}
