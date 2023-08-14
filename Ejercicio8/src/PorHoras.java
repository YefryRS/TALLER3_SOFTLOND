public class PorHoras extends Empleados{

    private int horasTrabajadas;

    public PorHoras() {
    }

    public PorHoras(String nombre, int cedula, double salarioPorHora, String cargo, int horasTrabajadas) {
        super(nombre, cedula, salarioPorHora, cargo);
        this.horasTrabajadas = horasTrabajadas;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public double calcularSalario() {
        double salario = getSalarioPorHora() * horasTrabajadas;
        return salario;
    }
}
