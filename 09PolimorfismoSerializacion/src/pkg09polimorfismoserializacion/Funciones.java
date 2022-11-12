/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg09polimorfismoserializacion;

/**
 *
 * @author alumno
 */


import java.io.*;
import java.util.*;
import javax.swing.*;

public class Funciones {
    
    //necesito poder guardar las diferentes barbies que vamos a crear
    ArrayList<Barbie> listadebarbies = new ArrayList();
    
    //variables
    String rep = "si";
    String nombre = "";
    String animal = "";
    String gafas = "";
    String lenguajeprogramacion = "";
    int edad, cedula;
    
    //se lo que tu quieras ser con barbie
    
    //aplicamos polimorfismo
    
    Barbie programadora = new Programadora();
    Barbie veterinaria = new Veterinaria();
    
    void menu(){
        
        while(true){
            while(rep.equalsIgnoreCase("si")){
                try{
                    String var = JOptionPane.showInputDialog("Ingresa la opcion deseada: \n"
                            + "1.- Registrar una nueva barbie programadora. \n"
                            + "2.- Registrar una nueva barbie veterinaria. \n"
                            + "3.- Consultar las barbies. \n"
                            + "4.- Buscar barbie \n"
                            + "Se lo que tu quieras ser con barbie wiiiii\n");
                    
                    if(var == null){
                        System.exit(0);
                    }
                    int opcion = Integer.parseInt(var);
                    
                    switch (opcion) {
                        case 1:
                            //metodo para pedir datos
                            pedirDatosProgramadora();
                            //le asigno los datos
                            programadora = 
                                    new Programadora(nombre, edad, lenguajeprogramacion, gafas);
                            //el metodo para guardarlo
                            guardarProgramadora();
                            
                            break;
                            
                        case 2:
                            //metodo para pedir datos
                            pedirDatosVeterinaria();
                            //le asigno los datos
                            veterinaria = 
                                    new Veterinaria(cedula, animal, nombre, edad);
                            //el metodo para guardarlo
                            guardarVeterinaria();
                            
                            break; 
                            
                        case 3:
                            //consultar a barbie
                            leerBarbie();
                            break;
                            
                        case 4:
                            //tarea wiiiii junto con todo el crud de una wiiii
                            break;
                        default:
                            System.out.println("Opcion no valida");
                    }
                    rep = JOptionPane.showInputDialog("¿Desea repetir?");
                    
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
                
                }
            }
        }
    
    
    }

    private void pedirDatosProgramadora() {
        //primero obtener todos los datos de la programadora
        nombre = JOptionPane.showInputDialog("Ingresa el nombre de la barbie programadora: ");
        edad = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la edad de la barbie programadora: "));
        lenguajeprogramacion = JOptionPane.showInputDialog("Ingresa los lenguajes que domina la barbie programadora: ");
        gafas = JOptionPane.showInputDialog("Ingresa el tipo de lentes que usa la barbie programadora: ");
    }

    private void guardarProgramadora() throws IOException {
        //para guardarlo necesito la lista
        listadebarbies.add(programadora);
        guardar();
        
        }

    private void pedirDatosVeterinaria() {
        cedula = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la Cedula Profesional de la barbie veterinaria: "));
        animal = JOptionPane.showInputDialog("Ingresa el tipo de marcota que cuida la barbie veterinaria: ");
        nombre = JOptionPane.showInputDialog("Ingresa el nombre de la barbie veterinaria: ");
        edad = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la edad de la barbie veterinaria: "));
    }

    private void guardarVeterinaria() throws IOException {
        //para guardarlo necesito la lista
        listadebarbies.add(veterinaria);
        guardar();
    }
    
    //son los archivos serializables
    
    private void leerBarbie() throws FileNotFoundException, IOException, ClassNotFoundException {
        /*
        aqui es donde vamor a aplicar la serializacion de archivos para que
        se pueda guardar la lista de barbie y poderla recuperar
        para ello se necesita los flujos de lectura y escritura de archivos
        */
        
        FileInputStream archivo = new FileInputStream("archivo.dat");
        //generamos un flujo de lectura del buffer de elementos binarios o mejor dicho
        //de objetos
        ObjectInputStream entrada = new ObjectInputStream(archivo);
        /*
        aqui es donde tenemos que empezr a transformar los bytes del buffer
        en objetos del array
        */
        listadebarbies = (ArrayList)entrada.readObject();
        
        //tengo que recorrer el array
        for(int i = 0; i < listadebarbies.size(); i++){
            //como voy recorriendo la lista vamos mostrandola
            Programadora fullstack = (Programadora)listadebarbies.get(i);
            
            //imprimo datos
            JOptionPane.showMessageDialog(null, "\n "
                    + "Nombre de la programadora : " + fullstack.getNombre() + "\n"
                    + "Edad de la programadora : " + fullstack.getEdad()+ "\n"
                    + "Lenguajes que domina la programadora : " + fullstack.getFullstack()+ "\n"
                    + "Gaffas que usa la programadora : " + fullstack.getLentes()+ "\n"
                    + "El tipo de barbie es: " + fullstack.tipobarbie());
        }
        
        //entrada.close();
    }

    private void guardar() throws FileNotFoundException, IOException {
        //para guardar el archivo tenemos que escribir una salida
        FileOutputStream archivo = new FileOutputStream("archivo.dat");
        //tenemos que definri el buffer de salida del archivo
        ObjectOutputStream salida = new ObjectOutputStream(archivo);
        
        //escribirmos los datos del array
        salida.writeObject(listadebarbies);
        //cerramos el flujo
        salida.close();
    }
    
}
