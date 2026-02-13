/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author lauda
 */
public class Empleado extends Persona implements Logable{
    private String password; 
    private int idEmpleado;
    
    public static final int EMPLOYEE_ID = 123;
    public static final String PASSWORD = "test";

    public Empleado(String nombre) {
        super(nombre);
        this.password = PASSWORD;
        this.idEmpleado = EMPLOYEE_ID;
    }
    
    

    public String getPassword() {
        return password;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    @Override
    public boolean login(int user, String password){
     if(this.idEmpleado == user && this.password.equalsIgnoreCase(password))
         return true; 
     else return false; 
    }

  
}
