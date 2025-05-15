import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
public class DepartementHashSet implements IDepartement<Departement>{
    Set<Departement> departements = new HashSet<>();

    public void ajouterDepartement(Departement d){
        departements.add(d);
    }
    public boolean rechercherDepartement(String nom){
        for (Departement d : departements) {
            if (d.getNom().equals(nom))
                return true;
        }

        return false;
    }
    public boolean rechercherDepartement(Departement d){
        return departements.contains(d);
    }
    public void supprimerDepartement(Departement d){
        departements.remove(d);
    }
    public void displayDepartement(){
        System.out.println(departements);
    }
    public TreeSet<Departement> trierDepartementById(){
        TreeSet<Departement> tree = new TreeSet<>(departements);
        return tree;
    }
}
