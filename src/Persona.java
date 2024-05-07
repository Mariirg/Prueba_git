public class Persona {
    private String Nombre;
    private String FechaDeNacimiento;
    private Integer Edad;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getFechaDeNacimiento() {
        return FechaDeNacimiento;
    }

    public void setFechaDeNacimiento(String fechaDeNacimiento) {
        FechaDeNacimiento = fechaDeNacimiento;
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
