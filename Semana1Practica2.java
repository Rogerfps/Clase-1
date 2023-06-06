/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semana1.practica2;

import javax.swing.JOptionPane;

/**
 *
 * @author Roger
 */
public class Semana1Practica2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic her
        String mensual = JOptionPane.showInputDialog("Digite el monto de ingreso mensual");
        String gasto = JOptionPane.showInputDialog("Digite el gasto mensual");
        
        double mensuali = Integer.parseInt(mensual);
        double gastoi = Integer.parseInt(gasto);
        
        double porcentaje_gastos = (mensuali*gastoi)/100;
        //double porcentaje_dispo = (mensuali* gastoi)
        System.out.println("Porcentaje de gastos mensual: "+ porcentaje_gastos);
        //System.out.println("Porcentaje disponible: "+ porcentaje_dispo);
        
        
        
    }
    
}
