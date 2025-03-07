package tn.esprit.gestionzoo.main;
import tn.esprit.gestionzoo.entities.*;
import tn.esprit.gestionzoo.exceptions.*;
public class ZooManagement {
    public static void main(String[] args) {
        Zoo myZoo = new Zoo("Safari Park", "Tunis");
        Animal lion = new Animal("Felidae","Simba", 5, true);
        Animal tiger = new Animal("tiger", "lili", 6, true);
        Animal fox = new Animal("fox", "kurama", 6, true);
        Dolphin d1= new Dolphin("Mammal","Dolphin",-15,true,"ocean",60.0f);
        Penguin p1= new Penguin("Mammal","Penguin",14,true,"ocean",50.0f);
        try {
            myZoo.addAnimal(lion);
            myZoo.addAnimal(tiger); // This should throw InvalidAgeException
            myZoo.addAnimal(fox);
            myZoo.addAnimal(p1);
            myZoo.addAnimal(d1);
        } catch (ZooFullException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InvalidAgeException ex) {
            System.out.println("Error: " + ex.getMessage()); // Handle InvalidAgeException
        }

}
}
