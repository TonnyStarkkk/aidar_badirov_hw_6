package org.example;

public class Boss extends GameEntity{
    private Weapon weapon;
    public Boss(String name, int health, int damage, Weapon weapon){
        super(name, health, damage);
        this.weapon = weapon;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
    public String printInfo(){
        return "Boss: " + getName() + "\nHealth: " + getHealth() + "\nDamage: " + getDamage() +
                "\nWeapon: " + weapon.getWeaponName() + " (" + weapon.getWeaponType() + " )";
    }
}
