/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author lauda
 */
public class Cliente extends Persona implements Payable {
    private int idCliente;
    Amount balance; 
    
    public static final int MEMBER_ID= 456;
    public static final double BALANCE = 50.00;

    public Cliente(String nombre) {
        super(nombre);
        this.idCliente = MEMBER_ID;
        this.balance = new Amount(BALANCE);
    }

    public int getIdCliente() {
        return idCliente;
    }

    public Amount getBalance() {
        return balance;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public void setBalance(Amount balance) {
        this.balance = balance;
    }
    
    @Override
    public  boolean pay(Amount amount){
        balance.setQuantity(balance.getQuantity() - amount.getQuantity());
     if(balance.getQuantity() >= 0)
         return true; 
     else return false; 
    }
}
