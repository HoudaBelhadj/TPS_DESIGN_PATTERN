package design.pattern.Etat;

public class EtatValidee extends Etat {

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
        System.out.println("Commande est bien verifiee");
    }

    @Override
    public Etat passerVersEtatSuivant() {
        return new EtatLivree();
    }

    @Override
    public void effectureLivrerCommande() {
        System.out.println("Tache non supportee");
    }
}
