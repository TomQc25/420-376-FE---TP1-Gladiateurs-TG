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
public class mirmillon extends Personnage {
    // ****************************************
    // <editor-fold desc="ATTRIBUTS">
    String classe;
    // </editor-fold>

    //*****************************************
    //<editor-fold defaultstate="collapsed" desc="CONSTRUCTEURS et INITIALISATION">
    public mirmillon(String nom, int attaqueMax, int defense, int pvs, int ini, String classe) {
      super(nom, attaqueMax, defense, pvs, ini);
      this.classe = classe;
    }
    
    public mirmillon() {
        super();
        this.classe = "";
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
    public void setNewInitiativeRandom() {
        Random rand = new Random();
        int minValue = 0;
        int maxValue = 30 + 1;
        initiative = rand.nextInt(maxValue - minValue) + minValue;
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
