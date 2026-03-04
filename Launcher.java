package vallegrande.edu.pe.prueba;

public class Launcher {
    public static void main(String[] args) {
        // Crear objeto Mascota
        Mascota miMascota = new Mascota("Luna", "Perro", 3);

        // Mostrar información inicial
        System.out.println("Información inicial:");
        miMascota.mostrarInformacion();

        // Llamar a cumplirAnios()
        miMascota.cumplirAnios();

        // Mostrar información actualizada
        System.out.println("Información después de cumplir años:");
        miMascota.mostrarInformacion();
    }
}