package esprit.tn.GestionEmploye;

public abstract class Employe {
    private int nbr_heures;

    protected  int id,nbh;
    protected String nom,adresse;

    public Employe(int id,String n)
    {
        this.id=id;
        nom=n;
    }

    public Employe(){
    }

    public Employe(int id, String nom, String adresse, int nbrHeures) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNbh() {
        return nbh;
    }

    public void setNbh(int nbh) {
        this.nbh = nbh;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }
    public int getNbr_heures() {
        return nbr_heures;
    }

    public void setNbr_heures(int nbr_heures) {
        this.nbr_heures = nbr_heures;
    }
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public abstract double calculerSalaire();

    public String toString()
    {
        return "id :"+id+"nom :"+nom+
                "adresse :" +adresse+"nombre heure :"+nbh;
    }
}
