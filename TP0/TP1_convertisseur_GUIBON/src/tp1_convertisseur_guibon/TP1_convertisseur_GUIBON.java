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
        System.out.println("Bonjour, saisissez une valeur :");
        double valeur;
        Scanner temp = new Scanner(System.in);
        valeur = temp.nextInt();
        System.out.println(valeur);
        System.out.println("Saisissez la cerversion que vous saihaitez effectuer : \n1) Celcius vers Kelvin \n2) Kelvin vers celcius \n3) Farhenheit vers celcius \n4) Celcius vers Farhenheit vers celcius \n5 Kelvin vers farenheit \6 Farenheit vers kelvin");
        int choix;
        Scanner choice = new Scanner(System.in);
        choix = choice.nextInt();
        if (choix == 1){
            CelciusVersKelvin (valeur);                    
        }
        else if (choix ==2){
            KelvinVersCelcius(valeur);
        }
        else if (choix == 3) {
            FarenheitVersCelcius(valeur);
        }
        else if (choix == 4) {
            CelciusVerFarenheit(valeur);
        }
        else if (choix == 5) {
            KelvinVerFarenheit(valeur);
        }
        else if (choix == 6) {
            FarenheitVersKelvin(valeur);
        }
    }
    public static double CelciusVersKelvin (double tCelcius){
        double Kelvin;
        Kelvin = tCelcius + 273;
        System.out.println(Kelvin+" Kelvin");
        return 0;
    }
    public static double KelvinVersCelcius(double tKelvin){
        double Celcius;
        Celcius = tKelvin-273;
        System.out.println(Celcius+" Celcius");
        return 0;
    }
    public static double FarenheitVersCelcius(double tFarenheit){
        double Celcius;
        Celcius = (tFarenheit -32) * 1.8;
        System.out.println(Celcius+" Celcius");
        return 0;
    }
    public static double CelciusVerFarenheit(double tCelcius){
        double Farenheit;
        Farenheit = (tCelcius -32) / 1.8;
        System.out.println(Farenheit+" Farenheit");
        return 0;
    }
    public static double KelvinVerFarenheit(double tKelvin){
        double Farenheit;
        Farenheit = (tKelvin - 273.15)*9/5+32;
        System.out.println(Farenheit+" Farenheit");
        return 0;
    }
    public static double FarenheitVersKelvin(double tFarenheit){
        double Kelvin;
        Kelvin = (tFarenheit-32)*5/9+ 273.15;
        System.out.println(Kelvin+" Kelvin");
        return 0;
    }
    }



