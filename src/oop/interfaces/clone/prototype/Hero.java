package oop.interfaces.clone.prototype;

import java.util.ArrayList;

enum Skills{MAGIC, HIDE, FLY}

public class Hero implements Prototype {
    private String name;
    private int lives;
    private ArrayList<Skills> skills = new ArrayList<>();
    private ArrayList<Weapon> weapons = new ArrayList<>();
    private int protection;
    private boolean isHeroLive = true;

    public Hero(String name, int lives, int protection) {
        this.name = name;
        this.lives = lives;
        this.protection = protection;
    }

    public String getName() {
        return name;
    }

    public int getLives() {
        return lives;
    }

    public ArrayList<Skills> getSkills() {
        return skills;
    }

    public ArrayList<Weapon> getWeapons() {
        return weapons;
    }

    public int getProtection() {
        return protection;
    }

    public void addSkills(Skills skill){
        skills.add(skill);
    }

    public void addWeapon(Weapon weapon){
        weapons.add(weapon);
    }

    public void addProtection(int additionalProtection){
        protection = protection + additionalProtection;
    }

    public void decreaseProtection(int minusProtection){
        protection = protection - minusProtection;
        if (protection < 0){
            protection = 0;
        }
    }

    public void addLives(int additionalLives){
        lives = lives + additionalLives;
    }

    public void decreaseLives(int minusLives){
        lives = lives - minusLives;
        if (lives <= 0){
            isHeroLive = false;
        }
    }

    @Override
    public Hero copy(){
        ArrayList<Weapon> weaponsTemp = new ArrayList<>();
        Hero newHero = new Hero(name, lives, protection);
        newHero.skills = this.skills;

        for (int i = 0; i < this.weapons.size(); i++) {
            Weapon original = weapons.get(i);
            Weapon copy = original.copy();
            weaponsTemp.add(copy);
           // weaponsTemp.add(weapons.get(i).copy());
        }
        newHero.weapons = weaponsTemp;
        newHero.isHeroLive = this.isHeroLive;
        return newHero;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", lives=" + lives + " %" +
                ", skills=" + skills +
                ", weapons=" + weapons +
                ", protection=" + protection + " %" +
                '}';
    }
}
