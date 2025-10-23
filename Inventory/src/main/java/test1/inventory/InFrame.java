/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test1.inventory;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author Chris
 */
public class InFrame extends JFrame {
    private Inventory manager;
    private JTextArea display;
    
    public InFrame() {
        manager = new Inventory();
        setTitle("Inventory Management System");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        
        display = new JTextArea();
        display.setEditable(false);
        add(new JScrollPane(display), BorderLayout.CENTER);
        
        JPanel buttonPanel = new JPanel();
        JButton addProductBtn = new JButton("Add Product");
        JButton viewProductBtn = new JButton("View Product");

        buttonPanel.add(addProductBtn);
        buttonPanel.add(viewProductBtn);
        add(buttonPanel, BorderLayout.SOUTH);
        
        addProductBtn.addActionListener(e -> addProduct());
        viewProductBtn.addActionListener(e -> viewProduct());
        
        setVisible(true);
    }
    
    private void addProduct() {
        JTextField idField = new JTextField();
        JTextField nameField = new JTextField();
        JTextField qtyField = new JTextField();
        JTextField priceField = new JTextField();
 
        
        Object[] fields = {
            "ID:", idField,
            "Name:", nameField,
            "Quantity:", qtyField,
            "Price", priceField
        };
        
        int option = JOptionPane.showConfirmDialog(this, fields, "Add Product", JOptionPane.OK_CANCEL_OPTION);
        if (option == JOptionPane.OK_OPTION) {
            try{
                int id = Integer.parseInt(idField.getText());
                String name = nameField.getText();
                int qty = Integer.parseInt(qtyField.getText());
                double price = Double.parseDouble(priceField.getText());
                
                Supplier altSupplier = new Supplier(1, "Default Supplier",  "N/A");
                Product product = new Product(id, name, qty, altSupplier, price);
                manager.addProduct(product);
                
                display.append("Added: "+ product +"\n");
            }catch (Exception ex){
                JOptionPane.showMessageDialog(this, "INVALID");
            }
        }
        
    }
    
    private void viewProduct(){
        display.setText("");
        for (Product p : manager.getProducts()) {
            display.append(p + "\n");
        }
    }
    
}
