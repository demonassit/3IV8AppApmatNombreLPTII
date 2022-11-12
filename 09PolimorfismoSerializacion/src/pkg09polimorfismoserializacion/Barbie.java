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

//es la clase abstracta porque es la que es capaz
//de transformarse en las demas

//vamos a poder guardar un registro de barbies

import java.io.Serializable;

//nos sirve para poder generar archivos desde binario

public abstract class Barbie implements Serializable{
    
    
    private String nombre;
    private int edad;
    
    public Barbie(){
    
    }

    public Barbie(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    //metodo que sea capaz de poder transformar a barbie
    //de acuerdo a lo que se necesite
    
    abstract String tipobarbie();
    
    
}
