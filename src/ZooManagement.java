
public class ZooManagement {
    public static void main(String[] args) {
        Animal lion = new Animal("Felidae","Simba", 5, true);
        Animal tiger = new Animal("tiger", "lili", 6, true);
        Animal fox = new Animal("fox", "kurama", 6, true);

        Zoo myZoo = new Zoo("Safari Park", "Tunis");
        myZoo.displayZoo();
        System.out.println("Ajout de lion : " + myZoo.addAnimal(lion));
        System.out.println("Ajout de tiger : " + myZoo.addAnimal(tiger));
        System.out.println("Ajout de fox : " + myZoo.addAnimal(fox));

        System.out.println("lion index: " +  myZoo.searchAnimal(lion));
        Animal lion2 = new Animal("Felidae", "Simba", 5, true);
        System.out.println("Simba index: " + myZoo.searchAnimal(lion2));
        System.out.println("Ajout de Simba : " + myZoo.addAnimal(lion2));
        System.out.println("Removing tiger: " + myZoo.removeAnimal(tiger));

        Zoo Zoo2 = new Zoo("Z park ", "Carthage");
        Zoo biggerZoo = Zoo.comparerZoo(myZoo, Zoo2);
        System.out.println("Zoo with more animals: " + biggerZoo.name);
}
}
