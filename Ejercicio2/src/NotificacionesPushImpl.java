public class NotificacionesPushImpl extends NotificacionesPush{

    public NotificacionesPushImpl() {
    }

    public NotificacionesPushImpl(String titulo, String mensaje, String destinatario, String plataforma) {
        super(titulo, mensaje, destinatario, plataforma);
    }

    @Override
    public void enviar() {
        System.out.println("La informacion del mensaje enviado es el siguiente");
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Mensaje: " + getMensaje());
        System.out.println("Destinatario: " + getDestinatario());
        System.out.println("Plataforma: " + getPlataforma());
    }
}
