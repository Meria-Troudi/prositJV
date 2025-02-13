public class Zoo {
    Animal[] animals ;
    String name;
    String city;
    int nbrAnimals =0;
    static final int NUMBER_OF_CAGES = 25;

    public Zoo(String name, String city) {
        animals = new Animal[NUMBER_OF_CAGES];
        this.name = name;
        this.city = city;
    }
    public boolean addAnimal(Animal animal){
        if (this.nbrAnimals < NUMBER_OF_CAGES) {
            if (searchAnimal(animal) == -1) {
                animals[nbrAnimals] = animal;
            nbrAnimals++;
            return true;
        } else {
                System.out.println("Animal " + animal.name + " already exists.");
                return false;
            }
        }else {
            System.out.println("Zoo is full! Cannot add more animals.");
            return false;
        }
    }
    public int searchAnimal(Animal animal) {
           for (int i = 0; i < nbrAnimals; i++) {
               if (animals[i].name.equals(animal.name)) {
                   return i;
               }
           }return -1;
    }
    public boolean removeAnimal(Animal animal){
        int index= searchAnimal(animal);
        if (index == -1)
            return false;
        for (int i = index; i < nbrAnimals; i++) {
            animals[i] = animals[i + 1];
        }
        animals[nbrAnimals] = null;
        nbrAnimals--;
        return true;
    }
    boolean isZooFull() {
        return nbrAnimals >= NUMBER_OF_CAGES;
    }
     static Zoo comparerZoo(Zoo z1, Zoo z2) {
           if (z1.nbrAnimals > z2.nbrAnimals) {
               return z1;
           }else {
               return z2;
           }
    }
    void displayZoo(){
      System.out.println("Name:" + name+"\nCity:" + city+"\nNumber of Cages:" +NUMBER_OF_CAGES );
    }
    public String toString() {

        return "Zoo name=" + name + ", city=" + city + ", nbrCage=" + NUMBER_OF_CAGES ;
    }
}
