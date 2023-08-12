public class Main {
    public static void main(String[] args) {

        //Cuenta de ahorro
        System.out.println("CUENTA DE AHORRO");
        CuentaAhorro cuentaAhorro = new CuentaAhorro("Yefry","10000111",300555111,2000000);
        cuentaAhorro.realizarInversion(500000);
        cuentaAhorro.realizarAhorro(500000);
        cuentaAhorro.retirarDinero(200000);
        cuentaAhorro.depositarDinero(300000);

        System.out.println("-----------------------------------------------------");

        //Cuenta corriente
        System.out.println("CUENTA CORRIENTE");
        CuentaCorriente cuentaCorriente = new CuentaCorriente("Esther","10000111",300555111,2000000);
        cuentaCorriente.realizarInversion(500000);
        cuentaCorriente.realizarAhorro(500000);
        cuentaCorriente.retirarDinero(200000);
        cuentaCorriente.depositarDinero(300000);
    }
}