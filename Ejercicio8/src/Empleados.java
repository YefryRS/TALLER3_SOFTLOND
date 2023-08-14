public abstract class Empleados {
    private String nombre;
    private int cedula;
    private double salarioPorHora;
    private String cargo;

    public Empleados() {
    }

    public Empleados(String nombre, int cedula, double salarioPorHora, String cargo) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.salarioPorHora = salarioPorHora;
        this.cargo = cargo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public double getSalarioPorHora() {
        return salarioPorHora;
    }

    public void setSalarioPorHora(double salarioPorHora) {
        this.salarioPorHora = salarioPorHora;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public abstract double calcularSalario();
}
