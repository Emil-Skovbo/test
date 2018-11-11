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
public class Person
{
    private String firstName;
    private String lastName;
    private Person father;
    private Person mother;

    public Person(String firstName, String lastName, Person father, Person mother)
    {
        if(firstName == null || lastName == null)
        {
            throw new IllegalArgumentException();
        }
        this.firstName = firstName;
        this.lastName = lastName;
        this.father = father;
        this.mother = mother;
        if(this.father == null)
        {
            this.father = this;
        }
        if(this.mother == null)
        {
            this.mother = this;
        }
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        if(firstName == null)
        {
            throw new IllegalArgumentException();
        }
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        if(lastName == null)
        {
            throw new IllegalArgumentException();
        }
        this.lastName = lastName;
    }

    public Person getFather()
    {
        return father;
    }
    
    public Person getPaternityGrandad()
    {
        return father.getFather();
    }
    
    public Person getPaternityGranmom()
    {
        return father.getMother();
    }
    
    public Person getMaternityGrandad()
    {
        return mother.getFather();
    }
    
    public Person getMaternityGranmom()
    {
        return mother.getMother();
    }

    public Person getMother()
    {
        return mother;
    }  

    @Override
    public String toString()
    {
        return firstName + " " + lastName;
    }
    
    
}
