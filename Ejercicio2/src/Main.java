public class Main {

    /* 2. Sistema de notificaciones: Diseña un sistema de notificaciones que pueda manejar varios tipos de notificaciones, como correos electrónicos, mensajes de texto y notificaciones push. Crea una interfaz que defina un método enviar y clases abstractas para cada tipo de notificación. Luego, implementa las clases concretas para cada tipo de notificación. */

    public static void main(String[] args) {
        //correo electronico
        System.out.println("CORREO ELECTRONICO: ");
        CorreoElectronicoImpl correoElectronico = new CorreoElectronicoImpl("Yefry","Entradas","Mensaje");
        correoElectronico.enviar();

        //mensaje de texto
        System.out.println("MENSAJE DE TEXTO");
        MensajeTextoImpl mensajeTexto = new MensajeTextoImpl(211555,"llamame cuando puedas","urgente","Yefry");
        mensajeTexto.enviar();

        //Notificaciones push
        System.out.println("NOTIFICACIONES PUSH");
        NotificacionesPushImpl notificacionesPush = new NotificacionesPushImpl("Actualizacion sistema","tu sistema cambiara por la actualizacion 9.20","yefry rodelo","Android");
        notificacionesPush.enviar();
    }

}