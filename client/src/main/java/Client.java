import java.net.DatagramPacket; //Es el “puerto” o canal por donde se envían y reciben los mensajes usando UDP
import java.net.DatagramSocket; //Representa un paquete de datos UDP (contiene el mensaje, la dirección IP y el puerto destino).
import java.net.InetAddress; //Es Basicamente la direccion de del ip que deseo

public class Client {

     public static void main(String[] args) throws Exception {

    /*Esto crea un socket UDP en un puerto aleatorio disponible.
    *El cliente no necesita especificar un puerto, 
    *porque sólo enviará mensajes.
    */
    DatagramSocket socket = new DatagramSocket();
    String message = "Hello World"; // Mensaje Basico
    /*Como no podemos mandar un mensaje directamenet como String
     * Lo que hacemos es que lo convertimos en un String de Bytes
     * Basicamente secuenciarlo
     */
    byte[] data = message.getBytes();
    DatagramPacket packet = 
    new DatagramPacket(data, data.length, 
    InetAddress.getByName("192.168.131.42"), 5000);


     }
}
