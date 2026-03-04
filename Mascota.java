package vallegrande.edu.pe.prueba;

public class Mascota {
    // Atributos privados
    private String nombre;
    private String tipo;
    private int edad;

    // Constructor para inicializar todos los atributos
    public Mascota(String nombre, String tipo, int edad) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.edad = edad;
    }

    // Método para mostrar información
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Tipo: " + tipo);
        System.out.println("Edad: " + edad);
        System.out.println("------------------------");
    }

    // Método para aumentar la edad
    public void cumplirAnios() {
        this.edad += 1;
    }
}