
package boletin10_2;

import javax.swing.JOptionPane;

/**
 *
 * @author jano
 */
public class Boletin10_2 {
    public static void main(String[] args) {
        
        //GENERAR NÚMERO ALEATORIO E INTENTOS
        int aleatorio = (int)(Math.floor(Math.random()*(50-1+1)+1));
        int intentos = (int)(Math.floor(Math.random()*(10-5+1)+5));
        
        
        //JUEGO
        int contador=0;
        JOptionPane.showMessageDialog(null, "Tienes "+intentos+" intentos para encontrar el número\nSUERTE! "+aleatorio);
        do{
            int numSupuesto=Integer.parseInt(JOptionPane.showInputDialog("JUGADOR 2 \n****************************\nIntroduce un número"));
            if (aleatorio==numSupuesto){
                JOptionPane.showMessageDialog(null, "BINGOOO!\n Has acertado");
                break;
            }
            else if((numSupuesto <= (aleatorio+5)) || (numSupuesto<= (aleatorio-5))){
                JOptionPane.showMessageDialog(null, "Muy cerquita!!!!");
            
            }
            else if((numSupuesto <= (aleatorio+10)) || (numSupuesto<= (aleatorio-10))){
                JOptionPane.showMessageDialog(null, "Algo cerca");
            
            }
            else if((numSupuesto <= (aleatorio+20)) || (numSupuesto<= (aleatorio-20))){
                JOptionPane.showMessageDialog(null, "Todavía lejos");
            
            }
            else if((numSupuesto > (aleatorio+21)) || (numSupuesto< (aleatorio-21))){
                JOptionPane.showMessageDialog(null, "Te has pasado por muchísimo!");
            
            }
        contador++;
        }while(contador<intentos);
        
    }
    
}
