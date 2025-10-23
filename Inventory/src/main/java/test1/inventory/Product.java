/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test1.inventory;

/**
 *
 * @author Chris
 */
public class Product {
    private int id;
    private String name;
    private int quantity;
    private Supplier supplier;
    private double price;
    
    public Product (int id, String name, int quantity, Supplier supplier, double price) {
        this.id  = id;
        this.name = name;
        this.quantity = quantity;
        this.supplier = supplier;
        this.price = price;
    }
    
    public int getId() {return id;}
    public String getName() {return name;}
    public int getquantity() {return quantity;}
    public Supplier getSupplier() {return supplier;}
    public double getPrice() {return price;}
    
    public void setName(String name) {this.name = name;}
    public void setQuantity(int quantity) {this.quantity = quantity;}
    public void setSupplier(Supplier supplier) {this.supplier = supplier;}
    public void setPrice(double price) {this.price = price;}
    
    @Override
    public String toString() {
        return name + "(Qty: "+ quantity +", Price: "+ price +")";
    }
}

