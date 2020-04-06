package Proj3;

public class Weapon {
    public int damage;
    public String name;

    public Weapon(String name, int damage){
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public String getName() {
        return name;
    }
}
