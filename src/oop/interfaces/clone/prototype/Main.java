package oop.interfaces.clone.prototype;

public class Main {
    public static void main(String[] args) {
        Hero hero = new Hero("Super Men", 100, 100);
        Weapon gun = new Weapon("Gun", true);
        Weapon ak_47 = new Weapon("AK-47", true);
        Weapon knife = new Weapon("Knife", true);

        hero.addWeapon(gun);
        hero.addWeapon(ak_47);
        hero.addWeapon(knife);

        hero.addLives(50);
        hero.addProtection(50);
        hero.addSkills(Skills.FLY);
        hero.addSkills(Skills.HIDE);

        System.out.println(hero);

        Hero hero2 = hero.copy();
        System.out.println(hero2);

        System.out.println();

        Weapon m16 = new Weapon("M16", true);
        hero.addWeapon(m16);
        hero.addLives(100);

        System.out.println(hero);
        System.out.println(hero2);

        System.out.println();

        gun.setIsWork(false);
        ak_47.setIsWork(false);

        System.out.println(hero);
        System.out.println(hero2);

    }
}
