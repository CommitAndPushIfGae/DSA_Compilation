/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package prelims;
import java.util.Scanner;
/**
 *
 * @author CL2~PC27
 */
public class Rain {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Rock Paper Scissors:");
        System.out.println("Player 1: ");
        String p1 = in.nextLine().toLowerCase();
        System.out.println("Player 2: ");
        String p2 = in.nextLine().toLowerCase();
        
        if (p1.equals("rock") && p2.equals("rock")){
            System.out.println("DRAW!");
        } else if (p1.equals("rock") && p2.equals("paper")){
            System.out.print("Player 2 wins!");
        } else if (p1.equals("rock") && p2.equals("scissors")){
            System.out.print("Player 1 wins!");
        } else if (p1.equals("paper") && p2.equals("rock")){
            System.out.print("Player 1 wins!");
        } else if (p1.equals("paper") && p2.equals("paper")){
            System.out.print("DRAW!");
        } else if (p1.equals("paper") && p2.equals("scissors")){
            System.out.print("Player 2 wins!");
        } else if (p1.equals("scissors") && p2.equals("rock")){
            System.out.print("Player 2 wins!");
        } else if (p1.equals("scissors") && p2.equals("paper")){
            System.out.print("Player 1 wins!");
        } else if (p1.equals("scissors") && p2.equals("scissors")){
            System.out.print("DRAW!");
        } else {
            System.out.println("Player 1 or Player 2 made an invalid input.");
        }
    }
}