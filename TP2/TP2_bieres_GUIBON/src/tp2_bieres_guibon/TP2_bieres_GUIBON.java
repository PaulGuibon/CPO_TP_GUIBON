/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_guibon;

/**
 *
 * @author 33783
 */
public class TP2_bieres_GUIBON {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls",7.0,"Dubuisson");
        uneBiere.lireEtiquette();
        BouteilleBiere deuxiemeBiere = new BouteilleBiere("Leffe", 6.6,"Abbaye de Leffe");
        deuxiemeBiere.lireEtiquette();
        BouteilleBiere troisiemeBiere = new BouteilleBiere("Heineken", 5.0,"Heineken");
        troisiemeBiere.lireEtiquette();
        BouteilleBiere quatriemeBiere = new BouteilleBiere("bierasse ", 68.6,"Brasserie du pochtron");
        quatriemeBiere.lireEtiquette();
        System.out.println(uneBiere) ;
    }   
}
