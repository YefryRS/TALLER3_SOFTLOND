public class CartaUNO implements Carta{

    private String color;
    private String valor;

    public CartaUNO() {
    }

    public CartaUNO(String color, String valor) {
        this.color = color;
        this.valor = valor;
    }

    @Override
    public void mostrarCarta() {
        System.out.println(color + " " + valor);
    }

    @Override
    public String getColor() {
        return color;
    }
}
