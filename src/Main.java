public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Mariana", 18,2005);
        persona1.setNombre("Mariana");
        persona1.setEdad(18);
        persona1.calcularFechaNacimiento();
        System.out.println(persona1.getFechaDeNacimiento());
        Trabajador trabajador = () -> System.out.println("Cualquier cosa");
        trabajador.realizarTarea();
        Rectangulo rectangulo = new Rectangulo("Rectangulo", "Rosado", 5.0, 3.0);
        Circulo circulo = new Circulo("Circulo", "Amarillo", 4.0);
        System.out.println("El area y perimetro del rectangulo son: ");
        System.out.println(rectangulo.calcularArea());
        System.out.println(rectangulo.calcularPerimetro());
        System.out.println("El area y el perimetro del circulo son: ");
        System.out.println(circulo.calcularArea());
        System.out.println(circulo.calcularPerimetro());
    }
}