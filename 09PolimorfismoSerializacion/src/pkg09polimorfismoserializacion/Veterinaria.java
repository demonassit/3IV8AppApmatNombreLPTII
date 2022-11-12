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
public class Veterinaria extends Barbie{
    
    private int cedulaprofesional;
    private String animalito;
    
    
    public Veterinaria(){
    
    }

    public Veterinaria(int cedulaprofesional, String animalito) {
        this.cedulaprofesional = cedulaprofesional;
        this.animalito = animalito;
    }

    public Veterinaria(int cedulaprofesional, String animalito, String nombre, int edad) {
        super(nombre, edad);
        this.cedulaprofesional = cedulaprofesional;
        this.animalito = animalito;
    }
    
    
    

    public int getCedulaprofesional() {
        return cedulaprofesional;
    }

    public void setCedulaprofesional(int cedulaprofesional) {
        this.cedulaprofesional = cedulaprofesional;
    }

    public String getAnimalito() {
        return animalito;
    }

    public void setAnimalito(String animalito) {
        this.animalito = animalito;
    }
    
    
    

    @Override
    String tipobarbie() {
        return ("Veterinaria");
    }
    
}
