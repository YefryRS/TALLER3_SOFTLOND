abstract public class NotificacionesPush implements Notificacion{

    private String titulo;
    private String mensaje;
    private String destinatario;
    private String plataforma;

    public NotificacionesPush() {
    }

    public NotificacionesPush(String titulo, String mensaje, String destinatario, String plataforma) {
        this.titulo = titulo;
        this.mensaje = mensaje;
        this.destinatario = destinatario;
        this.plataforma = plataforma;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    @Override
    public void enviar() {

    }

}
