import java.util.Comparator;

public class Departement implements Comparable<Departement>{
    private int id;
    private int nbrEmployes;
    private String nom;

    public Departement() {
    }
    public Departement(int id, int nbrEmployes, String nom) {
        this.id = id;
        this.nbrEmployes = nbrEmployes;
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Departement{" +
                "id=" + id +
                ", nbrEmployes=" + nbrEmployes +
                ", nom='" + nom + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (obj == this) return true;
        if (obj instanceof Departement d)
            return d.id == id && d.nom.equals(nom);
        return false;    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNbrEmployes() {
        return nbrEmployes;
    }

    public void setNbrEmployes(int nbrEmployes) {
        this.nbrEmployes = nbrEmployes;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    @Override
    public int hashCode(){
        int result = 17;
        result = result * 31 + id;
        result = result * 31 + nom.hashCode();
        return result;
    }

    @Override
    public int compareTo(Departement o) {
        return id - o.getId();
    }
}

