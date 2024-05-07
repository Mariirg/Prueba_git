public class Estudiante extends Persona implements Trabajador{
    private int Grado;

    @Override
    public void realizarTarea() {
        System.out.println("Realizando tarea escolar");
    }

    public Estudiante(String nombre, int edad, int fechaDeNacimiento, int grado) {
        super (nombre, edad, fechaDeNacimiento);
        this.Grado = grado;

    }
    @Override
    public String toString() {
        return "Estudiante{" + "Grado=" + Grado + '}';
    }

}

