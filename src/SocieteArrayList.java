import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
public class SocieteArrayList  implements IGestion<Employe>{
    List<Employe> employes;

    public SocieteArrayList() {
        employes = new ArrayList<>();
    }
    public void ajouterEmploye(Employe employe){
        employes.add(employe);
    }

    public boolean rechercherEmploye(String nom){
            for(int i = 0; i < employes.size(); i++) {
                if (employes.get(i).getNom().equals(nom))
                    return true;
            }
        return false;
    }
    public boolean rechercherEmploye(Employe employe){
        return employes.contains(employe);
    }

        public void supprimerEmploye(Employe employe){
            employes.remove(employe);
        }

        public void displayEmploye(){
            System.out.println(employes);
        }
        public void trierEmployeParId(){
            Collections.sort(employes);
        }
        public void trierEmployeParNomDepartementEtGrade(){
            Collections.sort(employes, new ComparatorParDep().thenComparing(new ComparatorParGrade()));
    }
}
