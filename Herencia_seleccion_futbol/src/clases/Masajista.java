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
public class Masajista extends Seleccion_fubtol{
    
    protected String titulacion;
    
    protected String anio_experiencia;

    public Masajista(String titulacion, String anio_experiencia, String id, String nombre, String apellido, int edad) {
        super(id, nombre, apellido, edad);
        this.titulacion = titulacion;
        this.anio_experiencia = anio_experiencia;
    }
    
    public void dar_masaje(){
        
        System.out.println("dar masaje");
        
    }
    
    
    
}
