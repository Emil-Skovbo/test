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
public class DieTest
{
    public static void main(String[] args)
    {
        Die d6 = new Die(6);
        System.out.println(d6);
        d6.roll();
        System.out.println(d6);
    }
}
