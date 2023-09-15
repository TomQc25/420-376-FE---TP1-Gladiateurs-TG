/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personnages;

import java.util.Random;

/**
 *
 * @author Thomas Garant
 */
public class Mirmillon extends Personnage {

    // ****************************************
    // <editor-fold desc="ATTRIBUTS">
    String classe;
    // </editor-fold>

    //*****************************************
    //<editor-fold defaultstate="collapsed" desc="CONSTRUCTEURS et INITIALISATION">
    public Mirmillon(String nom, int attaqueMax, int defense, int pvs, int ini) {
        super(nom, attaqueMax, defense, pvs, ini);
        classe = "Mirmillon";
    }

    public Mirmillon() {
        super();
        this.classe = "";
    }
    //</editor-fold>

    //*****************************************
    //<editor-fold desc="M�THODES">
    @Override
    public void afficherInfosPersonnage() {
        super.afficherInfosPersonnage();
        System.out.println("    Classe : " + classe);
    }

    @Override
    public void setNewInitiativeRandom() {
        Random rand = new Random();
        int minValue = 0;
        int maxValue = 30 + 1;
        initiative = rand.nextInt(maxValue - minValue) + minValue;
    }

    @Override
    public void frapperPersonnage(Personnage personnageCible) {
        for (int i = 1; i <= 2; i++) {
            super.frapperPersonnage(personnageCible);
            if (i == 1) {
                if (personnageCible.getPointsDeVie() == 0) {
                    System.out.println();
                    System.out.println(nom + " d�capite " + personnageCible.getNom());
                    break;
                } else {
                    System.out.println();
                    System.out.println(nom + " frappe de nouveau");
                }
            }
        }
    }
    //</editor-fold>

    //*****************************************
    //<editor-fold defaultstate="collapsed" desc="GETTERS et SETTERS">
    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }
    //</editor-fold>

}
