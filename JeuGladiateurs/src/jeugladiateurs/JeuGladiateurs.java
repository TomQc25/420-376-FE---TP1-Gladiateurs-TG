package jeugladiateurs;

import personnages.Personnage;
import personnages.mirmillon;
import personnages.retiaire;
import combat.CompteurDeTour;
import combat.AffichageEcran;

public class JeuGladiateurs {

    public static void main(String[] args) {

        // **************************************************************************
        // **************************************************************************
        // **************************************************************************
        // <editor-fold defaultstate="expanded" desc="Instanciation des objets">
        CompteurDeTour tour = new CompteurDeTour();
        AffichageEcran affichage = new AffichageEcran();
        mirmillon Bob = new mirmillon("Bob le malchanceux", 15, 15, 70, 15,"Mirmillon");
        retiaire Igor = new retiaire("Igor l'empaleur", 25, 5, 100, 30,"Retiaire");
        // </editor-fold>

        // **************************************************************************
        // **************************************************************************
        // **************************************************************************
        // <editor-fold defaultstate="collapsed" desc="Affichage pré-combat">
        Bob.afficherInfosPersonnage();
        Igor.afficherInfosPersonnage();
        affichage.afficherDebutCombat();
        // </editor-fold>
        // **************************************************************************
        // **************************************************************************
        // **************************************************************************
        // <editor-fold defaultstate="collapsed" desc="Mécanique de combat">
        for (int i = 0; i < 40; i++) {
            if (Bob.getPointsDeVie() == 0 || Igor.getPointsDeVie() == 0) {
                break;
            } else {
                tour.afficheTour();
                for (int j = 0; j < 100; j++) {
                    if (j == Bob.getInitiative()) {
                        Bob.frapperPersonnage(Igor);
                    }
                    if (j == Igor.getInitiative()) {
                        Igor.frapperPersonnage(Bob);
                    }
                }
                affichage.afficherSeparateurInfosPerso();
                Bob.afficherInfosPersonnage();
                Igor.afficherInfosPersonnage();
                Bob.setNewInitiativeRandom();
                Igor.setNewInitiativeRandom();
                tour.augmenteTour();
                affichage.afficherSeparateurDeTour();
            }
        }
        affichage.afficheVictoire(Bob, Igor);
        // </editor-fold>
    }

}
