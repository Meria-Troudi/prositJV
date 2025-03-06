package tn.esprit.gestionzoo.entities;
import tn.esprit.gestionzoo.exceptions.InvalidAgeException;
import tn.esprit.gestionzoo.exceptions.ZooFullException;
public class Zoo {
    private Animal[] animals ;
    private String name;
    private String city;
    private int nbrAnimals =0;
    static final int NUMBER_OF_CAGES = 3;

    private Aquatic[] aquaticAnimals;
    private int nbrAqA;

    public Zoo(String name, String city) {
        animals = new Animal[NUMBER_OF_CAGES];
        this.name = name;
        this.city = city;
        aquaticAnimals = new Aquatic[10];
    }

    public float maxPenguinSwimmingDepth(){
        float maxDepth= 0.0f;
        for (int i = 0; i < nbrAqA; i++) {
            if (aquaticAnimals[i] instanceof Penguin p) {
                if (p.getSwimmingDepth() > maxDepth )
                    maxDepth = p.getSwimmingDepth();
            }
        }
        return maxDepth;
    }
    public void displayNumberOfAquaticsByType(){
        int nbd=0; int nbp=0;
        for(Aquatic a:aquaticAnimals){
            if (a instanceof Penguin){
                nbp++;
            }else if(a instanceof Dolphin){
                nbd++;
            }
        }
        System.out.println("Number of Dolphins: " + nbd);
        System.out.println("Number of Penguins: " + nbp);
    }
    public void addAquaticAnimal(Aquatic aquatic){
        if( nbrAqA<10){
            aquaticAnimals[nbrAqA]=aquatic ;
            nbrAqA++;
        }
        else{
            System.out.println("Cannot add more aquatic animals.");
        }

    }
    public int getNbrAqA() {
        return nbrAqA;
    }
    public void setNbrAqA(int nbrAqA) {
        this.nbrAqA = nbrAqA;
    }
    public Aquatic[] getAquaticAnimals() {
        return aquaticAnimals;
    }
    public void setAquaticAnimals(Aquatic[] aquaticAnimal) {

        this.aquaticAnimals = aquaticAnimal;
    }

    public Animal[] getAnimals() {return animals;}
    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public String getName(){return name;}
    public void setName(String name){
        if(name.isEmpty())
            System.out.println("Zoo name cannot be empty.");
        else
            this.name = name;
    }

    public String getCity() {return city;}
    public void setCity(String city) {this.city = city;}

    public int getNbrAnimals() {return nbrAnimals;}
    public void setNbrAnimals(int nbrAnimals) {this.nbrAnimals = nbrAnimals;}

    public void addAnimal(Animal animal) throws ZooFullException , InvalidAgeException {

        if (animal.getAge() < 0) {
            throw new ZooFullException("Negative age.");

        }
        if (searchAnimal(animal) != -1) {
            System.out.println( animal.getName()+ " already exists.");
        }
        else  if (isZooFull()){
            throw new ZooFullException("The Zoo is full");
        }
        animals[nbrAnimals] = animal;
        nbrAnimals++;

    }
    public int searchAnimal(Animal animal) {
           for (int i = 0; i < nbrAnimals; i++) {
               if (animals[i].getName().equals(animal.getName())) {
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
        animals[nbrAnimals-1] = null;
        this.nbrAnimals--;
        return true;
    }
    boolean isZooFull() {

        return nbrAnimals >= NUMBER_OF_CAGES;
    }
     public Zoo comparerZoo(Zoo z1, Zoo z2) {
           if (z1.nbrAnimals > z2.nbrAnimals) {
               return z1;
           }else {
               return z2;
           }
    }
    public void displayZoo(){
      System.out.println("Name:" + name+"\nCity:" + city+"\nNumber of Cages:" +NUMBER_OF_CAGES );
    }
    public String toString() {

        return "name=" + name + ", city=" + city + ", nbrCage=" + NUMBER_OF_CAGES ;
    }
}
