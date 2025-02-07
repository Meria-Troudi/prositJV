
public class ZooManagement {
    public static void main(String[] args) {

        Animal lion = new Animal("Felidae","Simba", 5, true);
        Zoo myZoo = new Zoo("Safari Park", "Tunis", 10);
        myZoo.displayZoo();
        System.out.println(myZoo);
        System.out.println(lion);

       /* Animal lion = new Animal();
        lion.family = "Felidae";
        lion.name = "Simba";
        lion.age = 5;
        lion.isMammal = true;
        Zoo myZoo = new Zoo();
        myZoo.name = "Safari Park";
        myZoo.city = "Tunis";
        myZoo.nbrCages = 10;
        */
}
}
