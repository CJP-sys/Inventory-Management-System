/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package test1.inventory;

import java.util.*;
/**
 *
 * @author Chris
 */
public class Inventory {
    private LinkedList<Product> products;
    private HashMap<Integer, Supplier> suppliers;
    
    public Inventory() {
        products = new LinkedList<>();
        suppliers = new HashMap<>();
    }
    
    //product
    public void addProduct(Product product) {
        products.add(product);
    }
    
    public  void updateProduct(int id, String name, int quantity, double price) {
        for (Product p : products) {
            if(p.getId() == id) {
                p.setName(name);
                p.setQuantity(quantity);
                p.setPrice(price);
                break;
            }
        }
    }
    
    public void deleteProduct(int id) {
        products.removeIf(p -> p.getId() == id);
    }
    
    public Product searchProduct(String name) {
        for(Product p : products) {
                if(p.getName().equalsIgnoreCase(name)) {
                    return p;
                }
        }
        return null;
    }
    
    public LinkedList<Product> getProducts() {
        return products;
    }
    
    
    //supplier
    public void addSupplier(Supplier s) {
        suppliers.put(s.getId(), s);
    }
    
    public Supplier getSupplier(int id) {
        return suppliers.get(id);
    }
    
}
