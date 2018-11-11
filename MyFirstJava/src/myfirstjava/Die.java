/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myfirstjava;

import java.util.Random;

/**
 *
 * @author Tobias
 */
public class Die
{
    private static Random rnd = new Random();   
    private int sides;
    private int value;
    
    public Die(int sides)
    {
        if(sides < 2 || sides > 100)
        {
            throw new IllegalArgumentException();
        }
        this.sides = sides;
        this.value = 1;
    }
    
    public Die(Die d)
    {
        this.sides = d.sides;
        this.value = d.value;
    }
    
    public int getSides()
    {
        return sides;
    }
    
    public int getValue()
    {
        return value;
    }
    
    public void roll()
    {
        value = rnd.nextInt(sides)+1;
    }

    @Override
    public String toString()
    {
        return "Die{" + "sides=" + sides + ", value=" + value + '}';
    }
    
    
}
