public class Employe implements Comparable<Employe>{
    private int id;
	private String nom;
    private String prenom;
    private String nomDep;
    private int grade;
    public Employe() {
    }
    public Employe(int id, String nom, String prenom, String nomDep, int grade) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.nomDep = nomDep;
        this.grade = grade;
    }
    @Override
    public int compareTo(Employe o) {
        return this.id - o.id;
    }
    public boolean equals(Object obj){
        if (obj ==null)return false;
        if (obj instanceof Employe e) {
            return this.id == e.id && nom.equals(e.getNom());
        }
        return false;
    }
    public String toString(){
        return "ID:" + id +", NOM: "+ nom + ", PRENOM: " + prenom + ",DEPARTEMENT: " + nomDep + ", GRADE: " + grade+"\n";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNomDep() {
        return nomDep;
    }

    public void setNomDep(String nomDep) {
        this.nomDep = nomDep;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }


}
