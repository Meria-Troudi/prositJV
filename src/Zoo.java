public class Zoo {
    Animal[] animals = new Animal[25]; // Max 25 animals
    String name;
    String city;
    int nbrCages;
  Zoo(){}
    public Zoo(String name, String city, int nbrCages) {
        animals = new Animal[nbrCages];
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
    }
    void displayZoo(){
        System.out.println("Name:" + name+"\nCity:" + city+"\nNumber of Cages:" + nbrCages);
    }
    public String toString() {
        return "Zoo name=" + name + ", city=" + city + ", nbrCage=" + nbrCages ;
    }
}
