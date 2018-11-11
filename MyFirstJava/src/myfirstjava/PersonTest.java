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
public class PersonTest
{
    public static void main(String[] args)
    {
        Person god = new Person("God", "the one and only", null, null);
        Person adam = new Person("Adam", "the first of his name", god, god);
        Person eva = new Person("Eva","the first of her name", god, god);
        Person kain = new Person("Kain", "Son of Adam", adam, eva);
        Person abel = new Person("Abel", "Son of Adam", adam, eva);
        Person awan = new Person("Awan", "Daughter of Eva", adam, eva);
        Person enoch = new Person("Enoch", "Son of kain", kain, awan);
        
        System.out.println(adam.getPaternityGrandad());
        
    }
}
