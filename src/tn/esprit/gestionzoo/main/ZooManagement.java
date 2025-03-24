package tn.esprit.gestionzoo.main;
import tn.esprit.gestionzoo.entities.*;
import tn.esprit.gestionzoo.enums.Food;

public class ZooManagement {
    public static void main(String[] args) {


        Penguin penguin = new Penguin("Mammal", "Penguin", 3, true, "Ocean", 25.6f);
        penguin.eatMeat(Food.MEAT);
        Dolphin dolphin = new Dolphin("Mammal", "dolphin", 5, true, "Ocean", 34.2f);
        dolphin.eatMeat(Food.MEAT);
        Terrestrial terrestrial = new Terrestrial("Bears", "Winnie", 6, true, 4);
        terrestrial.eatPlantAndMeet(Food.BOTH);




       /* Zoo myZoo = new Zoo("Safari Park", "Tunis");
        Animal lion = new Animal("Felidae","Simba", 5, true);
        Animal tiger = new Animal("tiger", "lili", 6, true);
        try {
        Dolphin d1= new Dolphin("Mammal","Dolphin",-15,true,"ocean",60.0f);
        Penguin p1= new Penguin("Mammal","Penguin",14,true,"ocean",50.0f);
        try {
            myZoo.addAnimal(lion);
            myZoo.addAnimal(tiger);
            myZoo.addAnimal(fox);
            myZoo.addAnimal(p1);
            myZoo.addAnimal(d1);
        } catch (ZooFullException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InvalidAgeException ex) {
            System.out.println("Error:" + ex.getMessage());
        }*/

}
}
