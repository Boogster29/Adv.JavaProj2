/*
 *‘******************************************************
‘***  Class Name:CISK3342-110 Adv Java Programming
‘***  Class Author:Robert Gomez
‘******************************************************
‘*** Purpose of the class: Demonstrate the use of classes, objects, attributes, and methods.
‘***
‘******************************************************
‘*** 3 Oct 2017
‘******************************************************
‘*** Entering variables, creating a new class,setting attributes,methods.(3 Oct 2017)
‘*** Finishing code(3 Oct 2017).
‘******************************************************
‘*** Keeping it simple but keeping to instructions. Making color was a pain but 
‘*** works. Made display for each method and the data to be entered. I had help
‘*** in parts getting it to work. Not perfect but I hope it gets job done.
‘*** 
‘*** 
‘*******************************************************
‘***  Method Name:Multiple methodes used in the car class along with call methods.
‘***  Method Author: Robert Gomez
‘******************************************************
‘*** Purpose of the Method:to run the program and displays messages. 
‘*** Method Inputs:car.brake, accelerate.
‘*** List all the method parameters with their expected value ranges:increases and decreases speed by 5.
‘*** Return value:increase by 5 to decrease by 5.
‘*** If this is a function list the return data type and the expected range of 
‘*** values to be returned. Expected range of values are to go up by 5 for acceleration and
‘*** down by 5 for braking.
‘******************************************************
‘*** 3 Oct 2017
‘*******************************************************   
  */
 
package gomezadv.java.proj2;

import java.util.Scanner;
/**
 *
 * @author Boogster
 */
public class GomezAdvJavaProj2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         //Declare variables    
        int year, speed;
        String model,make, color;
        Scanner input=new Scanner(System.in);
        //request data from user
        System.out.print("Enter the year of the car:"); //attribute 1 added
        year=input.nextInt();
        System.out.print("Enter the model of the car:"); //attribute 2
        model=input.next();
        System.out.print("Enter the make of the car:"); //attribute 3
        make=input.next();
        System.out.print("Enter color of the car:"); //attribute 4
        color=input.next();
                
        Cars cars = new Cars(model,make,color); //prep for Cars class
        
        System.out.println(); //adds a space to display messages
        
        for (int i=0; i<5; i++) //loop for acceleration
            {
            cars.accelerate();
            System.out.println("The speed of the car after "+(i+1)+" acceleration:"+cars.getSpeed());
            }
        
        for (int i=0; i<5; i++) //loop for braking
            {
            cars.brake();
            System.out.println("The speed of the car after "+(i+1)+" brakes:"+cars.getSpeed());
            }
        }
}
    
    
    

