public class Persona {
    private String Nombre;
    private int FechaDeNacimiento;
    private int Edad;

    public Persona(String nombre, int edad, int fechaDeNacimiento) {

    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getFechaDeNacimiento() {
        return FechaDeNacimiento;
    }

    public void setFechaDeNacimiento(int fechaDeNacimiento) {
        FechaDeNacimiento = fechaDeNacimiento;
    }

    public void calcularFechaNacimiento(){
        FechaDeNacimiento = 2024 - Edad;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        if (edad >= 0){
            Edad = edad;
        }
        else {
            System.out.println("Tu edad no puede ser un numero negativo");
        }
    }



}
