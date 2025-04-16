import java.util.*;
public class Main {
    public static void main(String[] args) {
        SocieteArrayList S = new SocieteArrayList();
        Employe e1 = new Employe(1, "mimi", "mimi", "RH", 16);
        Employe e2 = new Employe(2, "Ben Ali", "Salma", "Marketing", 13);
        Employe e3 = new Employe(3, "Mansour", "Ahmed", "Informatique",15);
        S.ajouterEmploye(e2);
        S.ajouterEmploye(e1);
        S.ajouterEmploye(e3);
        System.out.println(S.rechercherEmploye(e1));
        S.displayEmploye();

        S.supprimerEmploye(e1);
        S.displayEmploye();

        System.out.println(S.rechercherEmploye("Andolsi"));
        S.trierEmployeParId();
        S.displayEmploye();
        S.trierEmployeParNomDepartementEtGrade();
        S.displayEmploye();


    }
}
