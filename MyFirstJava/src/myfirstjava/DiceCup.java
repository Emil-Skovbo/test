/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myfirstjava;

/**
 *
 * @author Tobias
 */
public class DiceCup
{
    private Die[] dice;
    
    public DiceCup(int[] sideNumbers)
    {
        dice = new Die[sideNumbers.length];
        for(int i = 0; i < dice.length; ++i)
        {
            dice[i] = new Die(sideNumbers[i]);
        }
    }
    
    public int getDiceCount()
    {
        return dice.length;
    }
    
    public void rollAll()
    {
        for(int i = 0; i < dice.length; ++i)
        {
            dice[i].roll();
        }
                if(getValue() == 1){
            return p2bank;
        }
        else{
            return p2bank+ value;
        }
    }
    
    public Die getDie(int i)
    {
        return new Die(dice[i]);
    }

    @Override
    public String toString()
    {
        StringBuilder res = new StringBuilder();
        for(int i = 0; i < dice.length; ++i)
        {
            res.append(dice[i]);
            res.append('\n');
        }
        return res.toString();
    }
    
    
    
}
