package esprit.tn.GestionEmploye;


public class Responsable extends  Employe {
    private double prime;

    public Responsable(int id, String nom, String adresse, int nbr_heures, double prime) {
        super(id, nom, adresse, nbr_heures);
        this.prime = prime;
    }


   public double calculerSalaire() {
        double salaire = getNbr_heures() * 10; // Salaire de base

        // Heures supplémentaires
        if (getNbr_heures() > 160) {
            salaire += salaire * 0.2;
        }

        return salaire + prime;
    }

    @Override
    public String toString() {
        return "Responsable{" +
                "id=" + getId() +
                ", nom='" + getNom() + '\'' +
                ", adresse='" + getAdresse() + '\'' +
                ", nbr_heures=" + getNbr_heures() +
                '}';

    }
}
