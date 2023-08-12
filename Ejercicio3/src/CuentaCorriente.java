
public class CuentaCorriente extends CuentasBancarias implements MovimientoFinancieros{


    public CuentaCorriente() {
    }

    public CuentaCorriente(String nombrePropietario, String cedulaPropietario, int numeroPropietario, double saldo) {
        super(nombrePropietario, cedulaPropietario, numeroPropietario, saldo);
    }

    @Override
    public void realizarInversion(double cantidad) {
        double saldo = getSaldo() - cantidad;
        setSaldo(saldo);
        System.out.println("Realizaste una inversion de: " + cantidad + ". Tu nuevo saldo en tu cuenta corriente es de: " + getSaldo());
    }

    @Override
    public void realizarAhorro(double cantidad) {
        double saldo = getSaldo() - cantidad;
        setSaldo(saldo);
        System.out.println("Realizaste un ahorro de: " + cantidad + ". Tu nuevo saldo en tu cuenta corriente es de: " + getSaldo());
    }

    @Override
    public void depositarDinero(double cantidad) {
        double saldo = getSaldo() - cantidad;
        setSaldo(saldo);
        System.out.println("Realizaste un depostio de: " + cantidad + ". Tu nuevo saldo en tu cuenta corriente es de: " + getSaldo());
    }

    @Override
    public void retirarDinero(double cantidad) {
        double saldo = getSaldo() - cantidad;
        setSaldo(saldo);
        System.out.println("Retirate un total de: " + cantidad + ". Tu nuevo saldo en tu cuenta corriente es de: " + getSaldo());
    }

}
