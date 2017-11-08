/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficas;
//Paso 1 - Importar Libreria
import javax.swing.*;//Libreria grafica estandar multiplataforma
import java.awt.*;//Libreria grafica del SO(Sistema operativo)
//Paso 8 - Importar la clase que contiene la gui
import gui.MiVentana;//Paquete.clase 
/**
 *
 * @author LAB17
 */
public class Graficas {

    /**
     * @param args the command line arguments
     */
    //Paso 9 - Llamado a la funcion
    public static void main(String[] args) 
    {
       MiVentana miventana = new MiVentana();//Creamos un objeto tipo JFrama
       miventana.setVisible(true);//Esta sentencia muestra la ventana 
       miventana.setBounds(0, 0, 400, 400);//Le asignamos tamaño a la ventana 
       miventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Esta sentencia cierra la ventana 
       
    }
    
}
