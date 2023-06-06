/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semana1.ek1;

import javax.swing.JOptionPane;

/**
 *
 * @author Roger
 */
public class Semana1Ek1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String num1 = JOptionPane.showInputDialog("Digite el primer numero");
        String num2 = JOptionPane.showInputDialog("Digite el segundo numero");
        String num3 = JOptionPane.showInputDialog("Digite el tercer numero");
        String num4 = JOptionPane.showInputDialog("Digite el cuarto numero");
        
        int nume1= Integer.parseInt(num1);
        int nume2= Integer.parseInt(num2);
        int nume3= Integer.parseInt(num3);
        int nume4= Integer.parseInt(num4);
        
        int sum = nume1 + nume2 + nume3 + nume4; 
        int prom = sum/4;
        
        System.out.println("La suma es: "+ sum);
        System.out.println("El promedio es: "+ prom);
    }
    
}
