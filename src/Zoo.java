public class Zoo {
    Animal[] animals ;
    String name;
    String city;
    int nbrCages;
  Zoo(){}
    public Zoo(String name, String city, int nbrCages) {
        animals = new Animal[25];
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
