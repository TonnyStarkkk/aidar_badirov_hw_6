package org.example;

public class Main {
    public static void main(String[] args) {
      Weapon bossWeapon = new Weapon(WeaponType.SWORD, "Dark");
      Boss boss = new Boss("Dark Boss", 800, 50, bossWeapon);

      Weapon skeletonWeapon1 = new Weapon(WeaponType.BOW, "Enchanted bow");
      Skeleton skeleton1 = new Skeleton("Archer", 150, 20, skeletonWeapon1, 25);

      Weapon skeletonWeapon2 = new Weapon(WeaponType.AXE, "Aron axe");
      Skeleton skeleton2 = new Skeleton("Warrior", 250, 30, skeletonWeapon2, 0);

        System.out.println(boss.printInfo());
        System.out.println("---------------------");
        System.out.println(skeleton1.printInfo());
        System.out.println("---------------------");
        System.out.println(skeleton2.printInfo());
    }
}