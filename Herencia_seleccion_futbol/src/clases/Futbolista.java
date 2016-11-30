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
public class Futbolista extends Seleccion_fubtol {
    
    
    protected  int dorsal;
    protected  String demarcacion;

    public Futbolista(int dorsal, String demarcacion, String id, String nombre, String apellido, int edad) {
        super(id, nombre, apellido, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public void jugar_partido(){
        
        
        System.out.println("jugar_partido");
        
        
    }
    
    public void entrenar(){
        
        System.out.println("entrenar");
        
        
        
        
    }
    
    

           
   
    
}
