/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package video96;

import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;

/**
 *
 * @author gleez
 */
public class Video96 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Frame_Sliders mimarco = new Frame_Sliders(); 
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}

class Frame_Sliders extends JFrame{
    public Frame_Sliders(){
        setBounds(500,400,550,350); 
        
        Lamina_Sliders milamina = new Lamina_Sliders(); 
        add(milamina); 
        setVisible(true);
    }
    
}

class Lamina_Sliders extends JPanel{
    
    public Lamina_Sliders(){
        
        JSlider control = new JSlider(0,100,25); 
        control.setMajorTickSpacing(50); 
        control.setMajorTickSpacing(25);
        
        control.setFont(new Font("Serif", Font.ITALIC,12));
        
        control.setPaintLabels(true);
        
        
        
        
        
        
        add(control); 
        
    }
    
}