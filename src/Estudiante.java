public class Estudiante extends Persona{
    private int Grado;

    public Estudiante(String nombre, int edad, int fechaDeNacimiento, int grado) {
        super (nombre, edad, fechaDeNacimiento);
        this.Grado = grado;

    }
    @Override
    public String toString() {
        return "Estudiante{" + "Grado=" + Grado + '}';
    }

}

