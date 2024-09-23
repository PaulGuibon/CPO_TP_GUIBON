/*Paul Guibon
TDA 
TP0 Partie 3*/

package calculator;

import java.util.Scanner;

public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Please enter the operator :\n1)add \n2)substract \n3multiply \n4)divide \n5)modulo");
        Scanner op = new Scanner(System.in);
        int operateur;
        operateur=op.nextInt();
        if (operateur>5){
            System.out.println("Veuillez entrer une valeur en 1 et 5");
            System.exit(0);
        }
        else if (operateur<1){
            System.out.println("Veuillez entrer une valeur en 1 et 5");
            System.exit(0);
        }
        System.out.println("Donner votre premiere valeur");
        Scanner first = new Scanner(System.in);
        float result;
        result=0;         
        float operande1;
        operande1=first.nextFloat();
        System.out.println("Donner votre seconde valeur");
        Scanner seconde = new Scanner(System.in);
        float operande2;
        operande2=seconde.nextFloat();
        if (operateur == 1){
        result = operande1 + operande2;
        }
        else if (operateur == 2){
            result = operande1 - operande2;
        }
        else if (operateur == 3){
            result = operande1 * operande2;
        }
        else if (operateur == 4){
        result = operande1 / operande2;
        }
        else if (operateur == 5){
            result = operande1 % operande2;
        }
        
        System.out.println(result);
        }
}
 

