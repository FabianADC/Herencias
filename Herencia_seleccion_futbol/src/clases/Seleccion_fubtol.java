/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author usuario
 */
public class Seleccion_fubtol {
    
    protected String id;
    protected String nombre;
    protected String apellido;
    protected int edad;

    public Seleccion_fubtol(String id, String nombre, String apellido, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

     public void concentrarse (){
        
        System.out.println("conentrarse");
        
    }
    
    
    
    public void viajar (){
        System.out.println("viajar");
        
        
        
    }
    
}
