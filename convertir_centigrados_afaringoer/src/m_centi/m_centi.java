/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m_centi;

import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class m_centi {
    
    
    public double n;
    public int dia;

    public m_centi(double n, int dia) {
        this.n = n;
        this.dia = dia;
    }

    public double getN() {
        return n;
    }

    public void setN(double n) {
        this.n = n;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }
 public void calculo(){
     
    
     double s;
     
       
       
             // menu de selecion de opciones 1 igual a centigrados a farenmgier   
             // menu de selecion de opciones 2 igual a farengeir a centigrados   
             
       
       switch (dia){
           
           
           case 1:
               s=(n*9/5)+32;
               
               
               JOptionPane.showMessageDialog(null, s);
       
               break;
               
           case 2:
 
               s=(n-32)*5/9;
               
               JOptionPane.showMessageDialog(null, s);
       
               break;
               
               
               
               
               
       }
       
       
       
       
   }
    
   
    
}
