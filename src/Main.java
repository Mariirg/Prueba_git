public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.setNombre("Mariana");
        persona1.setEdad(18);
        persona1.calcularFechaNacimiento();
        System.out.println(persona1.getFechaDeNacimiento());
    }
}