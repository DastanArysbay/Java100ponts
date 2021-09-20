package com.company;

public abstract class BrawlHeroes {

    private IBehievorClass fly;
    private IBehievorClass Nofly;
    private IShootClass Weapon;
     String NameOfBrawler;
     int Trophy;

    public BrawlHeroes (){
         NameOfBrawler = "Colt";
         Trophy = 780;
    };

    public void Details(){
        System.out.println("Name the Brawler: " + NameOfBrawler + ", trophy is "+ Trophy);
    }
    public abstract void display(String color, int vic );

    public void BrawlHeroes() {}

    public BrawlHeroes (String NameOfBrawler, int Trophy ){
        this.NameOfBrawler = NameOfBrawler;
        this.Trophy= Trophy;
    }

    public String getNameOfBrawler() {
        return NameOfBrawler;
    }

    public void setNameOfBrawler(String nameOfBrawler) {
        NameOfBrawler = nameOfBrawler;
    }

    public int getTrophy() {
        return Trophy;
    }

    public void setTrophy(int trophy) {
        Trophy = trophy;
    }

    protected abstract Flying fly();
    protected abstract NoFlying Nofly();

    protected abstract WithWeapon Weapon();
    protected abstract WithoutWeapon NoWeapon();



}
