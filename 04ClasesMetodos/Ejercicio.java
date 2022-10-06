
import java.util.Scanner;

class Ejercicio {

    /*
     * Vamos a hacer un programa mediante el cual vamos a tener 4 opciones que son
     * 1 otra calculadora
     * 2 conversion de unidades
     * 3 creacion de un cuadrito magico
     * 4 movimiento de un cuadro
     */

    // objetos
    Scanner entrada = new Scanner(System.in);

    // metodos o comportamientos de la clase
    // vamos a crear un metodo para el menu
    /**
     * public es el acceso a el tipo de dato, clase o metodo cualquier elemento del
     * programa puede acceder a el
     * private es de acceso restringido solo mediante reglas se puede acceder a el
     * protected se puede tener acceso solo desde la misma clase y aplicando la
     * herencia de POO entre los hijos y padres
     * 
     * Un metodo tambien es un tipo de dato aplicado
     */
    // la variable puede ser global
    char op;

    public void menu() {
        System.out.println("Bienvenido a los metodos");
        System.out.println("Elije una de las siguientes opciones: ");
        System.out.println("a.- Calculadora");
        System.out.println("b.- Conversion de Unidades");
        System.out.println("c.- Creacion de cuadros");
        System.out.println("d.- Movimiento de un cuadro");
        op = entrada.next().charAt(0);

        switch (op) {
            case 'a':
                // vamos a hacer un metodo
                Ejercicio1();
                break;
            case 'b':
                // vamos a hacer un metodo
                Ejercicio2();
                break;
            case 'c':
                // vamos a hacer un metodo
                Ejercicio3();
                break;
            case 'd':
                // vamos a hacer un metodo
                Ejercicio4();
                break;
            default:
                System.out.println("Gracias por estar aqui, pero hay que mimir n_n/ opcion no valida");
        }

    }

    // metodo 1
    public void Ejercicio1() {
        // calculadora
        // + - * /
        double num1 = 0.00, suma = 0.00, multi = 1.00;
        char operacion;

        System.out.println("Seleccionar la operacion que deseas realizar: ");
        System.out.println("a.- Suma y Resta");
        System.out.println("b.- Multiplicacion");
        System.out.println("c.- Division");

        operacion = entrada.next().charAt(0);

        switch (operacion) {
            case 'a':
                /** que sume tantos numeros como desee */
                do {
                    System.out.println("Para detener la operacion presione 0");
                    System.out.println("Escriba tantos numeros como quiera sumar o restar");
                    num1 = entrada.nextDouble();
                    suma += num1;
                    // suma = suma +num1;
                    System.out.println("El resultado es: " + suma);
                } while (num1 != 0);
                break;
            case 'b':
                /** que sume tantos numeros como desee */
                do {
                    System.out.println("Para detener la operacion presione 0");
                    System.out.println("Escriba tantos numeros como quiera multiplicar");
                    num1 = entrada.nextDouble();
                    multi *= num1;
                    // multi = multi *num1;
                    System.out.println("El resultado es: " + multi);
                } while (num1 != 0);
                break;
            case 'c':
                System.out.println("Ingrese el numerador");
                num1 = entrada.nextDouble();
                System.out.println("Ingrese el denominador");
                suma = entrada.nextDouble();

                if (suma == 0) {
                    System.out.println("No se puede realizar la division entre 0");
                } else {
                    multi = num1 / suma;
                }

                System.out.println("El resultado de la division es: " + multi);
                break;
            default:
                System.out.println("Opcion no valida");
                break;

        }

    }

    // metodo 2
    public void Ejercicio2() {
        /**
         * realizar una conversion de
         * metros a cm y pulgadas
         * kg a libras y gramos
         * m/s a km/h
         */
        double metros = 0.00, kg = 0.00, vel = 0.00, cm = 100.00, pulgadas = 39.37, gramos = 1000.00, libra = 2.20,
                ms = 0.00;

        double a, b;

        System.out.println("Seleccione la cantidad que desee convertir: ");
        System.out.println("a. Metros a cm y pulgadas");
        System.out.println("b. Kg a libras y gramos");
        System.out.println("c. m/s a km/h");
        op = entrada.next().charAt(0);

        switch (op) {
            case 'a':
                System.out.println("Ingrese la cantidad de metros");
                metros = entrada.nextDouble();
                a = metros * cm;
                b = metros * pulgadas;
                System.out.println(
                        "La cantidad de metros son: " + metros + " en cm son: " + a + " en pulgadas son: " + b);
                break;
            case 'b':
                System.out.println("Ingrese la cantidad de kilogramos");
                kg = entrada.nextDouble();
                a = kg * gramos;
                b = kg * libra;
                System.out.println("La cantidad de kg son: " + kg + " en gramos son: " + a + " en libras son: " + b);
                break;
            case 'c':
                System.out.println("Ingrese la cantidad de m/s");
                ms = entrada.nextDouble();
                a = ms * (3600 / 1000);

                System.out.println("La conversion de m/s a km/h son: " + a);
                break;
            default:
                System.out.println("Opcion no valida ayos");
                break;
        }

    }

    // metodo 3
    public void Ejercicio3() {
        /*
         * Vamos a realizar un programa que se encargue de imprimir con *
         * un cuadrado de maximo 1000 de dimension
         */
    }

    // metodo 4
    public void Ejercicio4() {
        /*
         * Vamos a realizar un programa que se encargue de imprimir con
         ******************
         * 
         * //////////////////
         ******************
         * //////////////////
         ******************
         * 
         * 
         * 
         * un cuadrado de maximo 100 de dimension
         */

    }

}
