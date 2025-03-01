package tn.esprit.gestionzoo.main;
import tn.esprit.gestionzoo.entities.*;

public class ZooManagement {
    public static void main(String[] args) {
        Zoo myZoo = new Zoo("Safari Park", "Tunis");
        Animal lion = new Animal("Felidae","Simba", 5, true);
        Animal tiger = new Animal("tiger", "lili", 6, true);
        Animal fox = new Animal("fox", "kurama", 6, true);
        System.out.println("Ajout de lion : " + myZoo.addAnimal(lion));
        System.out.println("Ajout de tiger : " + myZoo.addAnimal(tiger));
        System.out.println("Ajout de fox : " + myZoo.addAnimal(fox));
        Dolphin d1= new Dolphin("Mammal","Dolphin",15,true,"ocean",60.0f);
        Penguin p1= new Penguin("Mammal","Penguin",14,true,"ocean",50.0f);
        myZoo.addAquaticAnimal(d1);
        myZoo.addAquaticAnimal(p1);
        for (int i=0; i<10; i++){
            Aquatic[] aquatics = myZoo.getAquaticAnimals();
            aquatics[i].swim();
        }

        /*

        Aquatic aquatic = new Aquatic();
        Terrestrial terrestrial = new Terrestrial();
        Dolphin d = new Dolphin();
        Penguin p= new Penguin();

        Terrestrial tAn = new Terrestrial("Mammal", "Lion", 10, true, 4);
        Aquatic aAn = new Aquatic("Fish", "Shark", 15, false, "Ocean");
        Dolphin d1= new Dolphin("Mammal","Dolphin",15,true,"ocean",60.0f);
        Penguin p1= new Penguin("Mammal","Penguin",14,true,"ocean",50.0f);

        System.out.println(tAn);
        System.out.println(aAn);
        System.out.println(d1);
        System.out.println(p1);
        aAn.swim();
        d1.swim();
        p1.swim();
        */
}
}
