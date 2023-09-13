/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personnages;

/**
 *
 * @author Thomas Garant
 */
public class retiaire extends Personnage {

    // ****************************************
    // <editor-fold desc="ATTRIBUTS">
    String classe;
    // </editor-fold>

    //*****************************************
    //<editor-fold defaultstate="collapsed" desc="CONSTRUCTEURS et INITIALISATION">
    public retiaire(String nom, int attaqueMax, int defense, int pvs, int ini, String classe) {
        super(nom, attaqueMax, defense, pvs, ini);
        this.classe = classe;
    }

    public retiaire() {
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
