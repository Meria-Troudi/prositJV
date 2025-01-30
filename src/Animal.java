public class Animal {
    String family;
    String name;
    int age;
    boolean isMammal;
    Animal(){}
    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }
    public String toString() {
        return "Animal Name:" + this.name +", Family:" + this.family + ", Age:" + this.age + ", Mammal:" + this.isMammal;
    }
}