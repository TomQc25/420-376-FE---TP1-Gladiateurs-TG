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
public class retiaire extends Personnage {

    // ****************************************
    // <editor-fold desc="ATTRIBUTS">
    String classe;
    boolean filet;
    // </editor-fold>

    //*****************************************
    //<editor-fold defaultstate="collapsed" desc="CONSTRUCTEURS et INITIALISATION">
    public retiaire(String nom, int attaqueMax, int defense, int pvs, int ini) {
        super(nom, attaqueMax, defense, pvs, ini);
        classe = "Retiaire";
        filet = true;
    }

    public retiaire() {
        super();
        classe = "";
        filet = true;
    }
    //</editor-fold>

    //*****************************************
    //<editor-fold desc="MÉTHODES">
    @Override
    public void afficherInfosPersonnage() {
        super.afficherInfosPersonnage();
        System.out.println("    Classe : " + classe);
    }

    @Override
    public void frapperPersonnage(Personnage personnageCible) {
        if (isFilet() == true) {
            System.out.println();
            System.out.println(nom + " lance son filet");
            Random rand = new Random();
            int nombreAleatoire;
            int minValue = 1;
            int maxValue = 10 + 1;
            nombreAleatoire = rand.nextInt(maxValue - minValue) + minValue;
            if (nombreAleatoire == 5) {
                personnageCible.pointsDeVie = 0;
                System.out.println("Son filet attrape " + personnageCible.getNom() + " et il l'empale sauvagement avec sa lance");
            } else {
                System.out.println("Le filet n'atteint pas sa cible");
                filet = false;
            }
        } else {
            System.out.println();
            System.out.println(nom + " ramasse son filet et en profite pour attaquer");
            filet = true;
            super.frapperPersonnage(personnageCible);
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

    public boolean isFilet() {
        return filet;
    }

    public void setFilet(boolean filet) {
        this.filet = filet;
    }
    //</editor-fold>

}
