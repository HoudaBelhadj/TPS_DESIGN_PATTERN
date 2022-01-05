package org.example;

import design.pattern.Commande;
import design.pattern.Etat.Etat;
import design.pattern.Etat.EtatEnCours;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // Creation de la commande avec une etat initiale ==> En cours
        Commande commande = new Commande(new EtatEnCours());

        commande.ajouterProduitAuCommande(); // doit fonctionner
        commande.supprimerProduitAuCommande(); // doit fonctionner
        commande.verifierCommande();    // ne doit pas fonctionner

        // Passer vers l'etat suivante
        commande.etatSuivant();

        // Tester la commande avec l'etat validee
        commande.verifierCommande(); // doit fonctionner
        commande.livrerCommande(); // ne doit pas fonctionner
    }
}
