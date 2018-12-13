////////////////////////////////////////////////////////////////////
// Matteo Squeri 1143140
////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////
// Matteo Squeri 1143140
////////////////////////////////////////////////////////////////////
package it.unipd.tos.model;

public class MenuItem {
    private itemType type;
    private String name;
    private double price;
    public MenuItem(itemType type, String name, double price){
        this.type = type;
        this.name = name;
        this.price = price;
    }
    public double getPrice(){
        return price;
    }
    public boolean isPizza(){
        return type == itemType.PIZZA;
    }
}