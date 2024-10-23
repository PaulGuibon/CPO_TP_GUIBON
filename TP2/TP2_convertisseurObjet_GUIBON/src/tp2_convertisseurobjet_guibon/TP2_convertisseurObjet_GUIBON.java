/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_guibon;

/**
 *
 * @author 33783
 */
public class TP2_convertisseurObjet_GUIBON {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    }
    public class Convertisseur {
    // Attribut pour compter le nombre de conversions effectuées
    private int nbConversions;

    // Constructeur
    public Convertisseur() {
        this.nbConversions = 0;
    }

    // Méthode : Celsius vers Kelvin
    public float celsiusVersKelvin(float celsius) {
        nbConversions++;
        return celsius + 273.15f;
    }

    // Méthode : Kelvin vers Celsius
    public float kelvinVersCelsius(float kelvin) {
        nbConversions++;
        return kelvin - 273.15f;
    }

    // Méthode : Fahrenheit vers Celsius
    public float fahrenheitVersCelsius(float fahrenheit) {
        nbConversions++;
        return (fahrenheit - 32) * 5 / 9;
    }

    // Méthode : Celsius vers Fahrenheit
    public float celsiusVersFahrenheit(float celsius) {
        nbConversions++;
        return (celsius * 9 / 5) + 32;
    }

    // Méthode : Fahrenheit vers Kelvin
    public float fahrenheitVersKelvin(float fahrenheit) {
        nbConversions++;
        return (fahrenheit - 32) * 5 / 9 + 273.15f;
    }

    // Méthode : Kelvin vers Fahrenheit
    public float kelvinVersFahrenheit(float kelvin) {
        nbConversions++;
        return (kelvin - 273.15f) * 9 / 5 + 32;
    }

    // Redéfinition de la méthode toString
    @Override
    public String toString() {
        return "Nombre de conversions effectuées : " + nbConversions;
    }
}
  
}
