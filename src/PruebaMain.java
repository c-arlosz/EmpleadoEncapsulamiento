public class PruebaMain {
    public static void main(String[] args) {

        Empleado e = new Empleado("E001", "Felipe", 2000.00, "Felipe@gmail.com");
        System.out.println("Salario inicial: " + e.getSalario());

        e.aumentarSalario(10);
        System.out.println("Después de 10%: " + e.getSalario());
    }
}
