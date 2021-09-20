package com.company;

public class Colt extends BrawlHeroes {
    private String skinColor;
    private int Victories;

    public  Colt(){
        NoFlying fly = new NoFlying();
        fly.fly();
        WithWeapon withWeapon = new WithWeapon();
        withWeapon.Weapon();
    }
    @Override
    public void display(String color, int vic) {
        this.skinColor = color;
        this.Victories = vic;
        System.out.println("Skin Color is " + skinColor);
        System.out.println("Victory == " + Victories);
    }

    @Override
    protected Flying fly() {
        return null;
    }

    @Override
    protected NoFlying Nofly() {
        return null;
    }

    @Override
    protected WithWeapon Weapon() {
        return null;
    }

    @Override
    protected WithoutWeapon NoWeapon() {
        return null;
    }


}
