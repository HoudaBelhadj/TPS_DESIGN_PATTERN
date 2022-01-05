package design.pattern.Etat;

public class EtatLivree extends Etat {
    @Override
    public void effectureAjouterProduitAuCommande() {
        System.out.println("Tache non supportee");
    }

    @Override
    public void effectureSupprimerProduitAuCommande() {
        System.out.println("Tache non supportee");
    }

    @Override
    public void effectureVerifierCommande() {
        System.out.println("Tache non supportee");
    }

    @Override
    public Etat passerVersEtatSuivant() {
        return null; // There is no next State
    }

    @Override
    public void effectureLivrerCommande() {
        System.out.println("Livraison est bien effectuee");
    }
}
