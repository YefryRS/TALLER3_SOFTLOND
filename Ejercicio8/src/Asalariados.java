public class Asalariados extends Empleados{

    public Asalariados() {
    }

    public Asalariados(String nombre, int cedula, double salarioPorHora, String cargo) {
        super(nombre, cedula, salarioPorHora, cargo);
    }

    @Override
    public double calcularSalario() {
        double salario = getSalarioPorHora() * 240;
        return salario;
    }
}
