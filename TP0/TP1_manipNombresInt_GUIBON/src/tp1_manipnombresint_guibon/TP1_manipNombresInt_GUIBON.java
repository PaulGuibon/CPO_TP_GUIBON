package tp1_manipnombresint_guibon;

import java.util.Scanner;

/**
 *PAUL GUIBON
 * TDA 23/09
 * @author 33783
 */
public class TP1_manipNombresInt_GUIBON {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Donner votre premier entier");
        Scanner first = new Scanner(System.in);         
        int Var1;
        Var1=first.nextInt();
        System.out.println("Donner votre seconde entier");
        Scanner seconde = new Scanner(System.in);
        int Var2;
        Var2=seconde.nextInt();
        System.out.println("1er entier: "+Var1+" 2eme entier: "+Var2);
        int somme;
        somme = Var1 + Var2 ;
        int diff;
        diff = Var1 - Var2;
        int mult;
        mult = Var1*Var2;
        int div;
        div = Var1/Var2;
        float reste;
        reste =(float) ((Var1 * 1.0)/(Var2 * 1.0))-div;               
        System.out.println("somme = "+somme+"\n difference = "+diff+ "\n multiplication = "+mult+"\n division = "+div+"\n reste = "+reste);
       
             
             
    }
    
}
