public class Celular extends Electronica implements Productos{

    String marca;
    int modelo;
    String color;
    double precio;
    double envio;

    public Celular() {
    }

    public Celular(String marca, int modelo, String color, double precio, double envio) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.precio = precio;
        this.envio = envio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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

    @Override
    public void garantiaPorImprevistos() {
        System.out.println("Este modelo tiene una garantia de 1 año");
    }

    @Override
    public void accesoriosAdicionales() {
        System.out.println("Viene incluido con unos auriculares y su protectos de pantalla");
    }

    @Override
    public double calcularPrecio() {
        double precioTotal = precio + envio;
        return precioTotal;
    }

    @Override
    public String mostrarDetalles() {
        return "marca: " + marca + ", modelo: " + modelo + ", color: " + color;
    }

}
