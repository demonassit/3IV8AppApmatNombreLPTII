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
public class Programadora extends Barbie{
    
    private String fullstack;
    private String lentes;
    
    public Programadora(){
    
    }
    
    public Programadora(String nombre, int edad, String fullstack, String lentes) {
        super(nombre, edad);
        this.fullstack = fullstack;
        this.lentes = lentes;
    }

    public Programadora(String fullstack, String lentes) {
        this.fullstack = fullstack;
        this.lentes = lentes;
    }
    
    

    public String getFullstack() {
        return fullstack;
    }

    public void setFullstack(String fullstack) {
        this.fullstack = fullstack;
    }

    public String getLentes() {
        return lentes;
    }

    public void setLentes(String lentes) {
        this.lentes = lentes;
    }
    
    
    

    @Override
    String tipobarbie() {
        return ("Programadora");
    }
    
}
