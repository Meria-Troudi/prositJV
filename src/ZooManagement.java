
public class ZooManagement {
    public static void main(String[] args) {
        Animal lion = new Animal("Felidae","Simba", 5, true);
        Animal tiger = new Animal("tiger", "lili", 6, true);
        Animal fox = new Animal("fox", "kurama", 6, true);

        Zoo myZoo = new Zoo("Safari Park", "Tunis");
        //myZoo.displayZoo();
        //System.out.println(myZoo);
       // System.out.println(lion);
        System.out.println("Ajout de Simba : " + myZoo.addAnimal(lion));
        System.out.println("Ajout de Shere Khan : " + myZoo.addAnimal(tiger));
        System.out.println("Ajout de Kurama : " + myZoo.addAnimal(fox));
        int index = myZoo.searchAnimal(lion);
        System.out.println("Simba index: " + index);
        Animal lion2 = new Animal("Felidae", "Simba", 5, true);
        int index2 = myZoo.searchAnimal(lion2);
        System.out.println("Simba index: " + index2);
        //System.out.println("Ajout de Simba : " + myZoo.addAnimal(lion2));
        System.out.println("Removing Lili: " + myZoo.removeAnimal(tiger));

        Zoo Zoo2 = new Zoo("Z park ", "Carthage");
        Zoo biggerZoo = Zoo.comparerZoo(myZoo, Zoo2);
        System.out.println("Zoo with more animals: " + biggerZoo.name);
}
}
