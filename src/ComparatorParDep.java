import java.util.Comparator;

public class ComparatorParDep implements Comparator<Employe> {
    public int compare(Employe e1, Employe e2) {
        return e1.getNomDep().compareTo(e2.getNomDep());
    }
}
