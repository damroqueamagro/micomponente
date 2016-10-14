/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package componente;

import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.BevelBorder;



// Nuestro componente hereda de un JPanel
public class JLabelText extends JPanel {
    
   // Nuestro componente va a tener un JLabel y una JTextArea
    
    private JLabel  etiqueta;

    private JTextArea texto;
    
  
   //Contructor 
    
    public JLabelText(String etiqueta, String texto){

        this(new JLabel(etiqueta), new JTextArea(texto));
    }
    
//contructor por defecto para que se pueda agregar nuestro componente a la paleta
    public JLabelText () {
        this("Etiqueta","Ingrese el valor del campo");
    }

  
//Contructor Principal y dibuja el componente

    public JLabelText (JLabel etiqueta, JTextArea texto) {
	super();
        
        //Asignación de los atributos
        this.etiqueta =etiqueta;
	this.texto=texto;
        
	//Agregamos un borde al componente
	this.setBorder(new BevelBorder(BevelBorder.RAISED)); 
        //Área del componente
	this.setLayout(new BorderLayout());
	//Agregar la etiqueta en el lado izquierdo
	this.add(etiqueta, BorderLayout.WEST);          
	//Agregar el Area de Texto en la parte central
	this.add(texto, BorderLayout.CENTER);
        //pinto compoente
	this.repaint();

}
    
    
}