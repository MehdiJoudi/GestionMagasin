package esprit.tn.GestionEmploye;

public class Vendeur extends Employe {
    private double tauxDeVente;

    public Vendeur(int id, String nom, String adresse, int nbr_heures, double tauxDeVente) {
        super(id, nom, adresse, nbr_heures);
        this.tauxDeVente = tauxDeVente;
    }

    @Override
    public double calculerSalaire() {
        return 450 * (tauxDeVente / 100);
    }

    @Override
    public String toString() {
        return "Vendeur{" +
                "id=" + getId() +
                ", nom='" + getNom() + '\'' +
                ", adresse='" + getAdresse() + '\'' +
                ", nbr_heures=" + getNbr_heures() +
                '}';


    }
}