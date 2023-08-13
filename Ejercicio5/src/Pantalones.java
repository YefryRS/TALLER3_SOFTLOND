public class Pantalones extends Ropa implements Productos{

    private double precio;
    private double envio;
    private String color;
    private double talla;
    private String tela;

    public Pantalones(double precio, double envio, String color, double talla, String tela) {
        this.precio = precio;
        this.envio = envio;
        this.color = color;
        this.talla = talla;
        this.tela = tela;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getEnvio() {
        return envio;
    }

    public void setEnvio(double envio) {
        this.envio = envio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getTalla() {
        return talla;
    }

    public void setTalla(double talla) {
        this.talla = talla;
    }

    public String getTela() {
        return tela;
    }

    public void setTela(String tela) {
        this.tela = tela;
    }

    @Override
    public double calcularPrecio() {
        double precioTotal = precio + envio;
        return precioTotal;
    }

    @Override
    public String mostrarDetalles() {
        return "talla: " + talla + ", tela: " + tela + ", color: " + color;
    }

    @Override
    public void unidades() {
        System.out.println("Hay 100 unidades disponibles");
    }

    @Override
    public void descuentosEspeciales() {
        System.out.println("De momento no hay descuentos en este accesorio");
    }
}
