/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia_seleccion_futbol;

import clases.Futbolista;

/**
 *
 * @author usuario
 */
public class Herencia_seleccion_futbol {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
      // TODO code application logic here
      
        Futbolista ob1=new Futbolista(0, "defensa", "1720351559", "Jose", "JImenesz", 4);
        
       
        
        
       // System.out.println(ob1.getNombre()+ob1.getApellido());
       
        
       
        
        ob1.setNombre("Pepe");
        ob1.setApellido("el grillo");
        ob1.setEdad(28);
        
        
        
        System.out.println(ob1.getNombre()+ob1.getApellido()+ob1.getEdad());

        ob1.concentrarse();
        ob1.viajar();
        ob1.jugar_partido();
        ob1.entrenar();
        
        
          
     
        
        
        
        
        
        
        
      
    }
    
}
