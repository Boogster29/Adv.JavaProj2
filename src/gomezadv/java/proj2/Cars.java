/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gomezadv.java.proj2;


/**
 *
 * @author Boogster
 */
public class Cars {
    private int year, myYear; //year added for extra description
    private String model, myModel;
    private String make, myMake;
    private String color, myColor;
    private int speed;
    
    public Cars(String make, String model, String color)
    //error using public Car(make:string, model:string, color:color)
        {
            myMake=make;
            myModel=model;
            speed=0;
            myColor=color; //Color described as a constant for a graphics class
        /* Multiple methodes*/    
        }
    public void setMake()
        {
            make=myMake;
        }
    public String getMake()
        {
            return make;
        }
    public void setModel()
        {
            model=myModel;
        }
    public String getModel()
        {
            return model;
        }
    public void setColor() //Warning: Used as a graphics class method
        {
            color=myColor;
        }
    public String getColor() //Warning: Used as a graphics class method
        {
            return color;
        }
    public int getSpeed()
        {
            return speed;
        }
    public void accelerate()
        {
            speed +=5;
        }
    public void brake()
        {
            speed-=5;
        }
    }
        

    

