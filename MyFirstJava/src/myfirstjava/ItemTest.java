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
public class ItemTest
{
    public static void main(String[] args)
    {
        Item it1 = new Item(1, "12mm M8 Bolt", "Rustfri", 567);
        Item it2 = new Item(2, "10mm M8 Bolt", "Rustfri", 517);
        Item it3 = it1;
        System.out.println(it1);
        System.out.println(it2);
        System.out.println(it3);
    }
}
