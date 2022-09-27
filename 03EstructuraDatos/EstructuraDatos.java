
/**
 * Vamos a crear un programa que se encargue de realizar las siguientes operaciones
 * 
 * 1.- Bono o descuento por la edad
 * 2.- Convertir numeros decimales a binarios
 * 3.- Convertir temperaturas celcius, kelvine y rankine
 * 4.- Numero de positivos y negativos segun una lista de numeros
 * 5.- Tiendita peke
 * 6.- Area y Perimetro de figuras
 * 7.- Tabla
 * 8.- factorial
 * 9.- Dibujito
 * 10.- Figuras huecas de codigo
 * 111.- Patrones
 * 12.- Diamante (no llegan en lol)
 * 13.-Calculadora
 * 14.-Salir
 */

import java.util.Scanner;

class EstructuraDatos {
    // Programa 1
    public static void main(String[] args) {
        // declaro mi objeto
        Scanner entrada = new Scanner(System.in);

        // variables
        int edad, opcion, socio, numbinario, total, numerototal, n, a, b;
        int positivos = 0;
        int negativos = 0;
        double precio, bono;
        char letras, operacion;
        float precios = 0;
        float resultado = 0;
        int cantidad = 0;
        String binario = "";

        // vamos a crear un bucle para que se repita el programa
        do {
            // vamos a crear nuestro menu
            System.out.println("Bienvenido a la tareita que tenian que hacer wiiiii n_n/");
            System.out.println("Por favor elija la opcion deseada:");
            System.out.println("1 .- Descuento por edad");
            System.out.println("2 .- Convertir numero decimal a binario");
            System.out.println("3 .- Conversiones de temperatura");
            System.out.println("4 .- Numeros positivosy negativos");
            System.out.println("5 .- Tiendita");
            System.out.println("6 .- Area Y Perimetro");
            System.out.println("7 .- Tabla");
            System.out.println("8 .- Factorial");
            System.out.println("9 .- Dibujitos");
            System.out.println("10 .- Figura Hueca");
            System.out.println("11 .- Patrones");
            System.out.println("12 .- Diamante");
            System.out.println("13 .- Calculadora");
            System.out.println("14 .- Salir");

            opcion = entrada.nextInt();

            // nuestro switch
            switch (opcion) {
                case 1: // Ahi lo hacen
                    break;
                case 2:
                    System.out.println("Ingrese el numero positivo entero que desee convertir a binario");
                    numbinario = entrada.nextInt();
                    binario = "";

                    /* Tengo que comprobar que sea entero positivo */
                    if (numbinario > 0) {
                        // Debo de aplicar el algoritmo
                        while (numbinario > 0) {
                            if (numbinario % 2 == 0) {
                                binario = "0" + binario;
                            } else {
                                binario = "1" + binario;
                            }
                            numbinario = (int) numbinario / 2;
                        }

                    } else if (numbinario == 0) {
                        binario = "0";
                    } else {
                        binario = "\n No se pudo convertir el numero, ingrese solo positivos";
                    }
                    System.out.println("El numero binario es: " + binario);
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    // vamos a ver un for
                    for (n = 1; n <= 10; n++) {
                        System.out.println(n + " " + (n * 10) + " " + (n * 100) + " " + (n * 1000));
                    }
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 10:
                    System.out.println("Cuadrado Magico, asi kawaii, bien hueco como tu kokoro despues de elle");
                    System.out.println("Inserta el numero de unidades entre el 1 y 20");
                    n = entrada.nextInt();
                    // linea superior
                    if (n >= 1 && n <= 20) {
                        for (int i = 0; i < n; i++) {
                            System.out.print(" * ");

                        }
                        System.out.println("");
                        // cuadrado interno
                        for (int j = 0; j < n - 2; j++) {
                            // fila
                            System.out.print(" * ");
                            for (int k = 0; k < n - 2; k++) {
                                // columna
                                System.out.print("   ");
                            }
                            System.out.println(" * ");
                        }
                        // linea inferior
                        for (int i = 0; i < n; i++) {
                            System.out.print(" * ");

                        }
                        System.out.println("");

                    } else {
                        System.out.println("Error solo entre el 1 y 20, llegale");
                    }
                    break;

                case 11:
                    break;

                case 12:
                    break;

                case 13:
                    // calculadora
                    System.out.println("Bienvenido a la calculadora maizsoro");
                    System.out.println("Ingresa el primer numero");
                    a = entrada.nextInt();
                    System.out.println("Ingresa el segundo numero");
                    b = entrada.nextInt();
                    System.out.println("Ingresa el tipo de operacion (+ - * /)");
                    char ope = entrada.next().charAt(0);
                    switch (ope) {
                        case '+':
                            resultado = a + b;
                            System.out.println("La suma es: " + resultado);
                            break;
                        case '-':
                            resultado = a - b;
                            System.out.println("La resta es: " + resultado);
                            break;
                        case '*':
                            resultado = a * b;
                            System.out.println("La multiplicacion es: " + resultado);
                            break;
                        case '/':
                            if (b != 0) {
                                resultado = a / b;
                                System.out.println("La division es: " + resultado);
                            } else {
                                System.out.println(
                                        "El señor del sistema web con php y bd distribuida lo va a resolver y comprobar porque dijo que daba igual");
                            }

                            break;
                        default:
                            System.out.println("Operacion no admitida solo sabemos + - * /");

                    }
                default:
                    System.out.println("Operacion no admitida T_T");

            }

            // Debo de preguntar
            System.out.println("¿Deseas repetir el programa? Si lo desea escriba s");

            letras = entrada.next().charAt(0);
        } while (letras == 's' || letras == 'S');

    }
}