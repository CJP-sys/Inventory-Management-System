/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test1.inventory;

/**
 *
 * @author Chris
 */
public class Supplier {
    private int id;
    private String name;
    private String contactInfo;
    
    public Supplier(int id, String name, String contactInfo) {
        this.id = id;
        this.name = name;
        this.contactInfo = contactInfo;
    }
    
    public int getId() {return id;}
    public String getName() {return name;}
    public String getContactInfo() {return contactInfo;}
    
    public void setName(String name) {this.name = name;}
    public void setContactInfo(String contactInfo) {this.contactInfo = contactInfo;}
    
    @Override
    public String toString() {
        return name + "("+ contactInfo +")";
    }
    
}
