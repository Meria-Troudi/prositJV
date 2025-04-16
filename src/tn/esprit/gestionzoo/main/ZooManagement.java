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

}
}
