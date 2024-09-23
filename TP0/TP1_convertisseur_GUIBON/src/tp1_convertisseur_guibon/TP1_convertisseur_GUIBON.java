/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_convertisseur_guibon;

import java.util.Scanner;

/**Paul Guibon
 * 23/09/2024
 */
public class TP1_convertisseur_GUIBON {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Donner une temperature");
        Scanner sc = new Scanner(System.in); 
        double Celcius;
        Celcius = sc.nextDouble();
        System.out.println(Celcius+" degres Celcius");
        double Kelvin;
        Kelvin = Celcius + 273;
        System.out.println(Kelvin+" Kelvin");
        
    }
    public static double CelciusVersKelvin (double tCelcius){
        double Kelvin;
        Kelvin = tCelcius + 273;
        System.out.println(Kelvin+" Kelvin");
    }   
}


