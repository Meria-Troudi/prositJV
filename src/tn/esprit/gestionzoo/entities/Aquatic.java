package tn.esprit.gestionzoo.entities;
import tn.esprit.gestionzoo.interfaces.Carnivore;
import tn.esprit.gestionzoo.enums.Food;
public abstract class Aquatic extends Animal implements Carnivore<Food>{
    protected String habitat;


    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }
    public abstract void swim();


    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (null == obj) return false;
        if (obj instanceof Aquatic a){
            return habitat.equals(a.habitat) && getAge() == a.getAge() && getName().equals(a.getName()) ;
        }
        return false;
    }

    @Override
    public String toString() {
        return super.toString() + ", Habitat: " + habitat;
    }
}

