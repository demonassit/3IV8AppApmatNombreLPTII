
public class Gato extends Animal {
    /** la palabra reservada extends es para heredar */

    private int num_vidas;

    public Gato() {

    }

    public Gato(String nombre, String raza, String tipo_alimento, int edad, int num_vidas) {
        /**
         * para poder obtener o acceder a los atributos heredados debemos hacer uso de
         * la palabra reservada super
         */
        super(nombre, raza, tipo_alimento, edad);
        this.num_vidas = num_vidas;
    }

    public int getNum_vidas() {
        return num_vidas;
    }

    // set
    public void setNum_vidas(int num_vidas) {
        this.num_vidas = num_vidas;
    }

    public void mostrarGato() {
        System.out.println("El nombre del michi es: " + getNombre() + "\n"
                + "Su raza es: " + getRaza() + "\n"
                + "Se alimenta de: " + getTipo_alimento() + "\n"
                + "Su edad es: " + getEdad() + "\n"
                + "Sus vidas disponibles son: " + num_vidas + "\n");
    }

}
