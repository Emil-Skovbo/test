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
public class DiceCupTest
{
    public static void main(String[] args)
    {
        int[] diceSides = {6,6};
        DiceCup cup = new DiceCup(diceSides);
        
        cup.rollAll();
        
        System.out.println(cup);
    }
}
