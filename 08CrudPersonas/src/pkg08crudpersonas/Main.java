/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg08crudpersonas;

/**
 *
 * @author alumno
 */

import javax.swing.*;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //VistaPersona ventana = new VistaPersona();
        //ventana.Principal();
        
        //bienvenido a los guamazos para despertar a los dormiditos
        //tenemos que crear un JFrame
        
        JFrame ventana = new JFrame("Dormiditos");
        //definir el tamaño de la ventana
        ventana.setSize(550, 270);
        
        //definir las acciones para la ventana
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //toda ventana necesita un panel
        JPanel panel = new JPanel();
        //lo agregamos a la ventana
        ventana.add(panel);
        
        agregarComponentes(panel);
        
        ventana.setVisible(true);
        
    }

    private static void agregarComponentes(JPanel panel) {
        //vamos a inicializar el panel
        panel.setLayout(null);
        
        //etiquetas
        JLabel userlabel = new JLabel("Nombre de usuario");
        //vamos a definir su tamaño y orientacion dentro del panel
        userlabel.setBounds(10, 10, 120, 50);
        //agregamos al panel
        panel.add(userlabel);
        
        //campo de texto
        JTextField usertext = new JTextField();
        usertext.setBounds(160, 20, 160, 25);
        panel.add(usertext);
        
        
        //etiquetas
        JLabel userpassword = new JLabel("Password");
        //vamos a definir su tamaño y orientacion dentro del panel
        userpassword.setBounds(10, 40, 80, 50);
        //agregamos al panel
        panel.add(userpassword);
        
        //campo de texto
        JTextField passtext = new JTextField();
        passtext.setBounds(160, 50, 160, 25);
        panel.add(passtext);
        
        //botones
        JButton loginbutton = new JButton("Iniciar Sesion");
        loginbutton.setBounds(10, 80, 120, 25);
        panel.add(loginbutton);
        
        JButton registerbutton = new JButton("Registrate");
        registerbutton.setBounds(180, 80, 120, 25);
        panel.add(registerbutton);
        
    }
    
}
