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
public class Entrenador extends Seleccion_fubtol {
    
    protected String id_federacion;

    public Entrenador(String id_federacion, String id, String nombre, String apellido, int edad) {
        super(id, nombre, apellido, edad);
        this.id_federacion = id_federacion;
    }
    
    public void dirigir_partido(){
        
        System.out.println("dirigir partido");
        
        
        
    }
    
    public void dirigir_entrenamiento(){
        
        
        
    }
    
    
    
}
