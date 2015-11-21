package boletin10_1;

import javax.swing.JOptionPane;

/**
 *
 * @author jano
 */
public class Boletin10_1 {

    public static void main(String[] args) {
        
        //JUGADOR 1 (número para adivinar e intentos)
        int numAdivinar=Integer.parseInt(JOptionPane.showInputDialog("JUGADOR 1 \n****************************\nIntroduce el número para adivinar (entre 1 y 50)"));
        int numIntentos=Integer.parseInt(JOptionPane.showInputDialog("JUGADOR 1 \n****************************\nIntroduce el número de intentos"));
        
        //JUGADOR 2
        int contador=0;
        do{
          int numSupuesto=Integer.parseInt(JOptionPane.showInputDialog("JUGADOR 2 \n****************************\nIntroduce un número"));
          if(numAdivinar<numSupuesto){
              JOptionPane.showMessageDialog(null, "Te has pasado");
          }
          else if (numAdivinar>numSupuesto){
              JOptionPane.showMessageDialog(null, "Te has quedado corto");
          }
          else if (numAdivinar==numSupuesto){
              JOptionPane.showMessageDialog(null, "BINGO!!");
          }
          else{JOptionPane.showMessageDialog(null, "No sé qué has introducido pero no es un número");}
          contador++;
          break;
        
        }while(contador<numIntentos);
    }
    
}
