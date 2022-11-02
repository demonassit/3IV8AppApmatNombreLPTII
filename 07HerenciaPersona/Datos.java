import javax.swing.JOptionPane;

public class Datos {

    // necesitamos poder almacenar una lista de estudiantes
    Estudiante obj[] = new Estudiante[5];

    int x = 0;

    // menu
    void menu() {
        /*
         * crear dos opciones
         * 1 .- Registrar nuevo estudiante
         * 2.- Mostrar lista de estudiantes
         */
        String var = "si";
        while (var.equalsIgnoreCase("si")) {
            /**
             * Cuando se solicite una entrada de informacion debemos de ocupar JOptionPnae
             * el metodo de showInputDialog pero debemos entender que todas las entrada de
             * una interfaz son de tipo cadena
             */
            int op = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido \n"
                    + "Ingresa la opcion deseada: \n"
                    + "1.- Registrar nuevo estudiante. \n"
                    + "2.- Mostrar la lista de estudiantes."));

            switch (op) {
                case 1:
                    pedirEstudiante();
                    break;
                case 2:
                    mostrarEstudiante();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion no valida");
            }
            var = JOptionPane.showInputDialog("¿Desea registrar un nuevo estudiante?");
        }
    }

    public void pedirEstudiante() {
        /** Debemos declarar primero los datos que vamos a necesitar del estudiante */
        int boleta = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la boleta del estudiante"));
        String nom = JOptionPane.showInputDialog("Ingresa el nombre del estudiante");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la edad del estudiante"));
        char gen = JOptionPane.showInputDialog("Ingresa el genero del estudiante").charAt(0);

        // debo de ocupar mi arreglo de objetos
        obj[x] = new Estudiante(boleta, nom, edad, gen);
        x++;
    }

    public void mostrarEstudiante() {
        // recorrer mi arreglo de objetos
        for (int i = 0; i < x; i++) {
            JOptionPane.showMessageDialog(null,
                    "La boleta del estudiante es : " + obj[i].getNumBoleta() + "\n"
                            + "El nombre del estudiante es: "
                            + obj[i].getNombre() + "\n"
                            + "La edad del estudiante es: "
                            + obj[i].getEdad() + "\n"
                            + "El genero del estudiante es: "
                            + obj[i].getGenero() + "\n");
        }
    }

}
