package jeugladiateurs;

import personnages.Personnage;
import personnages.Mirmillon;
import personnages.Retiaire;
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
        Personnage Bob = new Mirmillon("Bob le malchanceux", 15, 15, 70, 15);
        Personnage Igor = new Retiaire("Igor l'empaleur", 25, 5, 100, 30);
        // </editor-fold>

        // **************************************************************************
        // **************************************************************************
        // **************************************************************************
        // <editor-fold defaultstate="collapsed" desc="Affichage pré-combat">
        //Bob.afficherInfosPersonnage();
        Igor.afficherInfosPersonnage();
        affichage.afficherDebutCombat();
        // </editor-fold>
        // **************************************************************************
        // **************************************************************************
        // **************************************************************************
        // <editor-fold defaultstate="collapsed" desc="Mécanique de combat">
        for (int i = 1; i < 40; i++) {
            if (Bob.getPointsDeVie() == 0 || Igor.getPointsDeVie() == 0) {
                break;
            } else {
                tour.afficheTour();
                for (int j = 0; j < 100; j++) {
                    if (j == Bob.getInitiative()) {
                        Bob.frapperPersonnage(Igor);
                    }
                    if (Igor.getPointsDeVie() == 0) {
                        break;
                    }
                    if (j == Igor.getInitiative()) {
                        Igor.frapperPersonnage(Bob);
                    }
                    if (Bob.getPointsDeVie() == 0) {
                        break;
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
