package design.pattern.Etat;

public class EtatEnCours extends Etat{

    @Override
    public void effectureAjouterProduitAuCommande() {
        System.out.println("Le Produit est bien ajoute a la commande");
    }

    @Override
    public void effectureSupprimerProduitAuCommande() {
        System.out.println("Le Produit est bien supprime de la commande");
    }

    @Override
    public void effectureVerifierCommande() {
        System.out.println("Tache non supportee");
    }

    @Override
    public Etat passerVersEtatSuivant() {
        return new EtatValidee();
    }

    @Override
    public void effectureLivrerCommande() {
        System.out.println("Tache non supportee");
    }
}
