public class Empleado implements Trabajador{
    private String Nombre;
    private double Salario;

    public Empleado(String nombre, double salario) {
    }


    @Override
    public void realizarTarea() {
        System.out.println("Realizando tarea laboral");
    }
}
