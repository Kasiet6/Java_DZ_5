package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss(500,45," Water ");
        System.out.println(boss.getHealth() + " " + boss.getDamage() + " " + boss.getDefence());

        for (Hero mens: createHeroes()) {
            System.out.println(mens.getHealth() + " " + mens.getDamage() + "" + mens.getSuperpower() );

        }
    }
    public static Hero[] createHeroes(){
        Hero Ilya = new Hero(300,5, " Fire");
        Hero Shrek = new Hero(200,65);
        Hero Vini = new Hero(300,65);
        Hero [] mens = { Ilya, Shrek, Vini};
        return mens;




    }



}
