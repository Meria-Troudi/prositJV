import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.*;
public class AffectationHashMap {
    Map<Employe,Departement> map = new HashMap<>();

    public AffectationHashMap(Map<Employe, Departement> map) {
        this.map = map;
    }
   public void ajouterEmployeDepartement(Employe e, Departement d){
       map.put(e,d);

   }
   public void afficherEmployesEtDepartements(){
       for(Map.Entry<Employe,Departement> e : map.entrySet()){
           System.out.println(e.getKey().getNom() + " " + e.getKey().getPrenom() +
                   " is in the " + e.getValue().getNom()+ " Departement");
   }
}
    void supprimerEmploye(Employe e){
        map.remove(e);
    }
    void supprimerEmployeEtDepartement(Employe e, Departement d){
        Departement dep = map.get(e);
        if(d.equals(dep)){
            supprimerEmploye(e);
        }
    }
    void afficherEmployes(){
        for(Employe e : map.keySet()){
            System.out.println(e);
        }
    }
    void afficherDepartements(){
        for(Departement d : map.values()){
            System.out.println(d);
        }

    }
    boolean rechercherEmploye (Employe e){
        return map.containsKey(e);
    }
    boolean rechercherDepartement (Departement d){
        return map.containsValue(d);
    }
    TreeMap<Employe, Departement> trierMap(){
        Comparator<Employe> Compartor = new Comparator<Employe>() {
            @Override
            public int compare(Employe o1, Employe o2) {
                return o1.getId() - o2.getId();
            }
        };
        TreeMap<Employe, Departement> tree = new TreeMap<>(Compartor);
        tree.putAll(map);
        return tree;
    }

}
