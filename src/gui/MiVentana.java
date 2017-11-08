/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;
//Paso 1 - Importar Libreria
import graficas.*;
import javax.swing.*;//Libreria grafica estandar multiplataforma
import java.awt.*;//Libreria grafica del SO(Sistema operativo)
/**
 *
 * @author LAB17
 */
//Paso 2 - Heredar mi clase desde JFrame
public class MiVentana  extends JFrame{

    //Paso 3 - Declarar los elementos que vamos a utilizar
    JPanel mipanel;//Creacion de objeto JPanel
    JLabel milabel;
    JTextField mitexto;
    JButton miboton;
    
    //Paso 4 - Definicion de contructor de la clase 
    public MiVentana() //Tiene el mismo nombre de la clase 
    {
        //Paso 5 - Crear e inicializar los objetos que utilizaremos 
        mipanel = new JPanel();//Creamos el objeto
        milabel = new JLabel();
        mitexto = new JTextField(10);//Que 10 son los caracteres 
        miboton = new JButton();
        
        //Paso 6 - Agregar los elementos al JFrame
        this.add(mipanel);//Agregamos el JPanel al JFrama
        mipanel.add(milabel);//Agregamos los elementos al JPanel
        mipanel.add(mitexto);
        mipanel.add(miboton);
        
        //PAso 7 - Propiedades de los elementos 
        milabel.setText("Campo");
        miboton.setText("presionar");
    }
    /*public static void main(String[] args) 
    {
       JFrame miventana = new JFrame();//Creamos un objeto tipo JFrama
       miventana.setVisible(true);//Esta sentencia muestra la ventana 
       miventana.setBounds(0, 0, 400, 400);//Le asignamos tamaño a la ventana 
       miventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Esta sentencia cierra la ventana 
       
    }*/
    
}
