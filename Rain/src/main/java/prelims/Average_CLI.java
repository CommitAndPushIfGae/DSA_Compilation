/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prelims;
import java.util.Scanner;
/**
 *
 * @author Rei
 */
public class Average_CLI {
    public static void main(String[]args){
    Scanner in = new Scanner(System.in);
    
    System.out.print("Enter grades for first quarter:");
    int Q1 = in.nextInt();
    System.out.print("Enter grades for second quarter:");
    int Q2 = in.nextInt();
    System.out.print("Enter grades for third quarter:");
    int Q3 = in.nextInt();
    System.out.print("Enter grades for fourth quarter:");
    int Q4 = in.nextInt();
    
    double Average = (Q1+Q2+Q3+Q4)/4;
    if (Average <=74)
        {
            System.out.println("Failed.");
        }
        else if (Average >=75 && Average<=79)
        {
            System.out.println("Passed.");
        }
        else if (Average >=80 && Average<=84)
        {
            System.out.println("Normal.");
        }
        else if (Average >=85 && Average<=89)
        {
            System.out.println("Good.");
        }
        else if (Average >=90 && Average <=94)
        {
            System.out.println("Very Good");
        }
        else if (Average >=95 && Average <=99)
        {
            System.out.println("Excellent");        
        }
        else
        {
            System.out.println("Invalid Grades.");
        }
    }
}
