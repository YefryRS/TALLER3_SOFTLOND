public abstract class CuentasBancarias {
    private String nombrePropietario;
    private String cedulaPropietario;
    private int numeroPropietario;
    private double saldo;

    public CuentasBancarias() {
    }

    public CuentasBancarias(String nombrePropietario, String cedulaPropietario, int numeroPropietario, double saldo) {
        this.nombrePropietario = nombrePropietario;
        this.cedulaPropietario = cedulaPropietario;
        this.numeroPropietario = numeroPropietario;
        this.saldo = saldo;
    }

    public String getNombrePropietario() {
        return nombrePropietario;
    }

    public void setNombrePropietario(String nombrePropietario) {
        this.nombrePropietario = nombrePropietario;
    }

    public String getCedulaPropietario() {
        return cedulaPropietario;
    }

    public void setCedulaPropietario(String cedulaPropietario) {
        this.cedulaPropietario = cedulaPropietario;
    }

    public int getNumeroPropietario() {
        return numeroPropietario;
    }

    public void setNumeroPropietario(int numeroPropietario) {
        this.numeroPropietario = numeroPropietario;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public abstract void realizarInversion(double cantidad);
    public abstract void realizarAhorro(double cantidad);

}
