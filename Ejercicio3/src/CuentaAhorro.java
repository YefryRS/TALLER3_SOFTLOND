
public class CuentaAhorro extends CuentasBancarias implements MovimientoFinancieros{


    public CuentaAhorro() {
    }

    public CuentaAhorro(String nombrePropietario, String cedulaPropietario, int numeroPropietario, double saldo) {
        super(nombrePropietario, cedulaPropietario, numeroPropietario, saldo);
    }

    @Override
    public void realizarInversion(double cantidad) {
        double saldo = getSaldo() - cantidad;
        setSaldo(saldo);
        System.out.println("Realizaste una inversion de: " + cantidad + ". Tu nuevo saldo en tu cuenta de ahorro es de: " + getSaldo());
    }

    @Override
    public void realizarAhorro(double cantidad) {
        double saldo = getSaldo() - cantidad;
        setSaldo(saldo);
        System.out.println("Realizaste un ahorro de: " + cantidad + ". Tu nuevo saldo en tu cuenta de ahorro es de: " + getSaldo());
    }


    @Override
    public void depositarDinero(double cantidad) {
        double saldo = getSaldo() - cantidad;
        setSaldo(saldo);
        System.out.println("Has depositado " + cantidad + ". Tu nuevo saldo en tu cuenta de ahorro es de: " + getSaldo());
    }

    @Override
    public void retirarDinero(double cantidad) {
        double saldo = getSaldo() - cantidad;
        setSaldo(saldo);
        System.out.println("Haz retirado: " + cantidad + ". Tu nuevo saldo en tu cuenta de ahorro es de: " + getSaldo());
    }

}
