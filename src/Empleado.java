public class Empleado implements Trabajador{
    private String Nombre;
    private double Salario;


    @Override
    public void realizarTarea() {
        System.out.println("Realizando tarea laboral");
    }
}
