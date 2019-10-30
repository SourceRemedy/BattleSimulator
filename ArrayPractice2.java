/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraypractice2;

import java.util.Random;

/**
 *
 * @author 734260
 */
public class ArrayPractice2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declare an array
        String[] names;
        int[] strengths;
        Random rand = new Random();
        //Initialize array with an array literal
        names = new String[] {"John", "Jeanette", "David", "Ashley"};
        strengths = new int[] {601, 535, 254, 690};
        //Order of strengths lines up with order of people
        
        //Retrieve one element
        //System.out.println(names [2]); //David
        //Determine length of array
        //System.out.println( names.length ); //4
        //Retrieve last element
        //System.out.println( names[names.length - 1] );
        
        //for ( int i = 0 ; i < 4 ; i++ ) {
        //Print out all names
        //System.out.println( names[i] );
        
        
        //Print random name
        //int randomIndex = (int) Math.random();
        //System.out.println( names[randomIndex]);
        
        //int randInt1 = rand.nextInt(5);
        //int randInt2 = rand.nextInt(5);
        
        //System.out.println(" "+randInt1+" ");
        //System.out.println (" "+randInt2+" ");
        
        
        for (int i = 0; i < 5 ; i++) {
           int randInt1 = rand.nextInt(4);
         int randInt2 = rand.nextInt(4);
            
            
            //int randomIndex = rand.nextInt(5);
            System.out.println( names[randInt1]);
        
        //int randomIndex1 = rand.nextInt(5);
        System.out.println( names[randInt2]);
        
        if (strengths[randInt2] > strengths[randInt1]) {
            System.out.println( ""+names[randInt2]+" has won the battle against "+names[randInt1]+"!");
        }
        
        else if (strengths[randInt2] < strengths[randInt1]) {
            System.out.println( ""+names[randInt1]+" has won the battle against "+names[randInt2]+"!");
        }
        
        else {
          System.out.println("The battle between "+names[randInt1]+" and "+names[randInt2]+" resulted in a draw!");
        }
        }
        
    }
    
}
