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
public class Item
{
    private int id;
    private String name;
    private String description;
    private int price;

    public Item(int id, String name, String description, int price)
    {
        if(id <= 0 || name == null || price < 0)
        {
            throw new IllegalArgumentException();
        }
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        if(name == null)
        {
            throw new IllegalArgumentException();
        }
        this.name = name;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public int getPrice()
    {
        return price;
    }

    public void setPrice(int price)
    {
        if(price < 0)
        {
            throw new IllegalArgumentException();
        }
        this.price = price;
    }

    @Override
    public String toString()
    {
        return "Item{" + "id=" + id + ", name=" + name + ", description=" + description + ", price=" + price + '}';
    }
    
    
    
}
