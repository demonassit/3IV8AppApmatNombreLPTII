/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg08crudpersonas;

/**
 * register, consult, udate, delete
 * registrar nueva persona
 * consultar a todas las personas
 * actualizar datos de persona
 * eliminar persona
 * buscar por id a una persona
 * @author alumno
 * 
 * 
 */

import java.util.ArrayList;

public class ControladorPersona {
    
    /*
    Vamos a ocupar un tipo de dato especial que sea
    capaz de almacenar diferentes tipos de datos y 
    objetos, porque, necesitamos tener una lista
    de personas que van a poder iniciar sesion
    asi como tambien van a poder registrarse, actualizar
    los datos, eliminar una cuenta y/o consultar y buscar
    los diferentes registros. 
    
    Para ello tenemos que ocupar ArrayList 
    */
    
    //lo primero es crear el objeto
    public static ArrayList<Persona> listadepersonas = 
            new ArrayList<Persona>();
    
    //el metodo para mostrar a todas las personas
    public ArrayList<Persona> mostrarPersonas(){
        return listadepersonas;
    }
    
    //el metodo que se encarga de registrar a una persona
    public void registrarPersona(Persona p){
        listadepersonas.add(p);
    } 
    
    //buscar a una persona por id
    public Persona buscarPersona(int id){
        //primero necesito un objeto para almacenar a la persona
        Persona encontrada = new Persona();
        
        //debo poder recorrer la lista de personas 
        for(Persona p : listadepersonas){
            if(id == p.getId()){
                //se encontro a la persona
                encontrada = p;
            }else{
                System.out.println("Persona no encontrada, no hay registro");
            }
        }
        return encontrada;
    }
    
    //vamos actualizar los datos
    public void actualizarPersona(Persona personaActualiza){
        /*
        Primero tengo que buscarla
        Despues obtener los datos
        Luego cambiarlos
        Enviarlo
        */
        
        Persona personaaActualizar = 
                buscarPersona(personaActualiza.getId());
        
        listadepersonas.remove(personaaActualizar);
        listadepersonas.add(personaActualiza);
    }
    
    //eliminar
    public void eliminarPersona(Persona personaEliminar){
        listadepersonas.remove(personaEliminar);
    }
    
}
