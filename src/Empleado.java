public class Empleado implements Trabajador {
    private String Nombre;
    public double SalarioBase;

    public Empleado(String nombre, double salarioBase) {
        this.Nombre = nombre;
        this.SalarioBase = salarioBase;
    }

    public double calcularSalario() {
        return SalarioBase;
    }

    @Override
    public void realizarTarea() {
        System.out.println("Realizando tarea laboral");
    }

}
