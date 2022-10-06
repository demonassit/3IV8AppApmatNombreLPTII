import java.util.Scanner;

import javax.print.attribute.standard.PageRanges;

import java.lang.Math;

public class Figura {
    /**
     * La libreria math nos sirve para poder
     * realizar calculos de potencias, raices para PI
     * Euler
     */
    // variables globales
    double lado, altura, area, perimetro, lado2, lado3;
    int opcion;
    char letra;
    boolean pan = false;
    String a;

    // objeto
    Scanner entrada = new Scanner(System.in);

    // metodos
    public void menu() {
        do {
            System.out.println("Programa de calculo de areas y perimetros");
            System.out.println("Elija una opcion");
            System.out.println("1.- Cuadrado");
            System.out.println("2.- Triangulo");
            System.out.println("3.- Circulo");
            System.out.println("4.- Pentagono");
            System.out.println("5.- Dodecagono");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    calcularCuadrado();
                    break;
                case 2:
                    // calcularTriangulo();
                    break;
                case 3:
                    // calcularCirculo();
                    break;
                case 4:
                    // calcularPentagono();
                    break;
                case 5:
                    // calcularDodecagono();
                    break;
                default:
                    System.out.println("Gracias por su atencion");

            }
            System.out.println("Desea repetir el programa, S para repetir");

        } while (letra == 's' || letra == 'S');
    }

    public void calcularCuadrado() {
        // bienvenidos a la tarea

        do {
            System.out.println("Ingrese el valor del lado del cuadrado");
            a = entrada.nextLine();
            try {
                lado = Double.parseDouble(a);
                pan = false;
            } catch (NumberFormatException ex) {
                pan = true;
                System.out.println("Valor no valido");
            }
        } while (pan);
        perimetro = lado * 4;
        area = lado * lado;
        System.out.println("El perimetro es de: " + perimetro + " el area es de : " + area);
    }

}
