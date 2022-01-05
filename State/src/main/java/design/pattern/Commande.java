package design.pattern;

import design.pattern.Etat.Etat;

public class Commande {

    // La classe Commande est Composee par la classe Etat
    private Etat etat;

    public Commande (Etat etat){
        this.etat = etat;
    }

    public void ajouterProduitAuCommande(){
        etat.effectureAjouterProduitAuCommande();
    }

    public void supprimerProduitAuCommande(){
        etat.effectureSupprimerProduitAuCommande();
    }

    public void verifierCommande(){
        etat.effectureVerifierCommande();
    }

    public void livrerCommande(){
        etat.effectureLivrerCommande();
    }

    public void etatSuivant(){
        etat = etat.passerVersEtatSuivant();
    }
}
