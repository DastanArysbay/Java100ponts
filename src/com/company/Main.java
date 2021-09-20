package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Colt colt= new Colt();
        colt.setNameOfBrawler("colt");
        colt.setTrophy(18000);
        colt.Details();
        colt.display("Blue", 3411);
        colt.fly();
        colt.Weapon();


        System.out.println('\n');


        ElPrimo elPrimo = new ElPrimo();
        elPrimo.setNameOfBrawler("ElPrimo");
        elPrimo.setTrophy(30000);
        elPrimo.Details();
        elPrimo.display("Yellow",4531);
        elPrimo.fly();
        elPrimo.Weapon();


    }
}
