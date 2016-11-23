/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convertir_centigrados_afaringoer;

import javax.swing.JOptionPane;
import m_centi.m_centi;

/**
 *
 * @author usuario
 */
public class Convertir_centigrados_afaringoer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        double n;
        int dia;
        
        
        
   
    
         n=Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese un numero "));
                   
         dia=Integer.parseInt(JOptionPane.showInputDialog("Selecciona una opcion  "+"\n"+"\n"+" Selecciona 1:"+"\n"+" si deseas convertir de grados centigrados a grados farengeir"+"\n"+"\n"+" Seleciona 2:"+"\n"+" Si deseas converitr de grados farengier a grados centigradps"));
           
         // dia equivale a la variable que forma el menu de opciones 
         
         m_centi ob1=new m_centi(n, dia);
         
         
         ob1.calculo();
         
         
        
         // TODO code application logic here
    }
    
}
