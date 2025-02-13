package tn.esprit.gestionzoo.entities;

public class Animal {
    private String family;
    private String name;
    private int age;
    private boolean isMammal;

    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }
    public String getFamily() {return family;}
    public void setFamily(String family) {this.family = family;}

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public int getAge() {return age;}
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("negatif age");
            this.age = 0;
        }
    }
    public boolean isMammal() {return isMammal;}
    public void setMammal(boolean isMammal) {this.isMammal = isMammal;}

    public String toString() {
        return "Animal Name:" + this.name +", Family:" + this.family + ", Age:" + this.age + ", Mammal:" + this.isMammal;
    }
}