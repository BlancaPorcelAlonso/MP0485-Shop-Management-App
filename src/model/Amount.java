/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.Currency;
import java.util.Locale;

//Clase amount que nos combine el importe con el simbolo ? 
public class Amount {
    private String simbol;
    private double quantity; 
    
    public Amount(double quantity){
     Currency euro = Currency.getInstance("EUR");
    this.simbol = "euros"; // ?;
    this.quantity = quantity;
    }
    public void setQuantity(double quantity){
    this.quantity = quantity;
    }   
    public double getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return quantity + " " + simbol;
    }
    
  
}

