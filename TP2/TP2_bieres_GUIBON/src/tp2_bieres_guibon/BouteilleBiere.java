package tp2_bieres_guibon;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 33783
 */
public class BouteilleBiere  {

    public BouteilleBiere(String unNom, double unDegre, String

uneBrasserie) {
Nom = unNom;
degreAlcool = unDegre;
brasserie = uneBrasserie;
ouverte = false;
}
    String Nom;
    double degreAlcool;
    String brasserie;
    boolean ouverte;
   
    public void lireEtiquette(){
System.out.println("Bouteille de " + Nom +" (" + degreAlcool +
" degres) \nBrasserie : " + brasserie ) ;
}
    public boolean decapsuler() {
if (!ouverte) {
    ouverte = true; // Ouvre la bière
    return true; // Indique que l'opération s'est bien passée
}
else {
    System.out.println("Erreur : bière déjà ouverte");
    return false; // Indique que l'opération a échoué
        }
        }