public class Persona {
    private String Nombre;
    private int FechaDeNacimiento;
    private Integer Edad;

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

    public Integer getEdad() {
        return Edad;
    }

    public void setEdad(Integer edad) {
        if (edad >= 0){
            Edad = edad;
        }
        else {
            System.out.println("Tu edad no puede ser un numero negativo");
        }
    }



}
