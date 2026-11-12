public class Empleado {
    private final String id;
    private String nombre;
    private double salario;
    private String email;
    private static double salario_minimo = 1300;

    public Empleado(String id, String nombre, double salario, String email) {
        if (id == null || id.isBlank()) {
            throw new IllegalArgumentException("El ID no puede ser nulo ni estar vacío.");
        }
        this.id = id;
        setNombre(nombre);
        setSalario(salario);
        setEmail(email);
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    private void setNombre(String nombre) {
        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío.");
        }
        this.nombre = nombre.strip();
    }

    public double getSalario() {
        return salario;
    }

    private void setSalario(double salario) {
        if (salario < salario_minimo) {
            throw new IllegalArgumentException("El salario no puede ser inferior al salario mínimo ($"+salario_minimo+").");
        }
        this.salario = salario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email == null || !email.contains("@") || email.indexOf("@") == 0 || !email.endsWith(".com")){
            throw new IllegalArgumentException("El formato del correo electrónico es inválido.");
        }
        this.email = email;
    }

    public void aumentarSalario(double porcentaje) {
        if (porcentaje <= 0) {
            throw new IllegalArgumentException("El porcentaje debe ser mayor a 0.");
        }
        this.salario += this.salario * (porcentaje / 100.0);
    }
}
