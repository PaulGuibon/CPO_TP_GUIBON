/*Paul Guibon
TDA
23/09*/
 
package exo1;

import java.util.Scanner;

/**
 *
 * @author 33783
 */
public class Exo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic heres
        String prenom;
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.println("Bonjour, quel est votre prenom ?");
        prenom = sc.nextLine();
        System.out.println("Au revoir "+prenom);
    }
    
}
