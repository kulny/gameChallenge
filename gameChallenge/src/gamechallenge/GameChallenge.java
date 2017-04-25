/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamechallenge;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Cody
 */
public class GameChallenge {

    
    
    public static boolean securityCheck()   {
        
        Scanner input = new Scanner(System.in);
        
        List<String> approvedNames = new ArrayList<String>();
        approvedNames.add("cody");
        approvedNames.add("derick");
        String playerName ="";
        
        System.out.println("Now, what is your name?");
        playerName = input.next();
        
        if(approvedNames.contains(playerName.toLowerCase())) {
            System.out.println("Welcome back, Captain. What will you be doing today?");
            return true;
            
        } else {
            System.out.print("Error. User not recognized. Exiting system.");
            return false;
        }
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        
        //                          VARIABLES HOUSE-----------------------------
        
        
        
        
        
        
        
        
        
        
        
        //                          MAIN------------------------------------
        System.out.println("Welcome to the game challenge. Here we will create a game/n"
                + "and continually build it up. We will Challenge each other to continually/n"
                + "add features and concepts, one after the other, until we are bored./n"
                + "Or incapable. Or something./n"
                + "How this works is I will create a game, of some length and quality/n"
                + "(probably only a short text adventure, for now) and send it to you,/n"
                + "then challenge you to add something to it. A room. A feature. A GUI./n"
                + "Something. And so we will continue, and so we will learn, and so we will grow./n"
                + "So, enjoy this game challenge, my friend. ");
        
        // /n is intended to put a line break at each point, but I don't know how to make it work.
        // Give it a try if you'd like, I'm interested in knowing how to make it work. One 
        // long line annoys me to no end.
        
        System.out.println();
        System.out.println();
        
        boolean mayContinue = securityCheck();
        
        if (mayContinue == true) {
            System.out.println("Now, you add stuff to this. make sure you comment so I know /n"
                    + "what your changes were and all that");
            
        } else {
            System.exit(0);
        }
        
    }
    
}
