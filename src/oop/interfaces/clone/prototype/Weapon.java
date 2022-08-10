package oop.interfaces.clone.prototype;

public class Weapon implements Prototype {
    private String title;
    private boolean isWork;

    public Weapon(String title, boolean isWork){
        this.title = title;
        this.isWork = isWork;
    }

    public void setIsWork(boolean work){
        this.isWork = work;
    }

    @Override
    public Weapon copy(){
        Weapon newWeapon = new Weapon(title, isWork);
        return newWeapon;
    }

    @Override
    public String toString() {
        return "Weapon{" +
                "title='" + title + '\'' +
                ", isWork=" + isWork +
                '}';
    }
}
