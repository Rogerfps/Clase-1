/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semana1.practica.pkg1;

import javax.swing.JOptionPane;

/**
 *
 * @author Roger
 */
public class Semana1Practica1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String edad = JOptionPane.showInputDialog("Digite su edad");
        int edadd = Integer.parseInt(edad);
        int sum = edadd+5;  
        System.out.println("Su edad en 5 años es: "+ sum);
        
    }
    
}
