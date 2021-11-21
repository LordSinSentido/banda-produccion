
import jssc.SerialPort;
import jssc.SerialPortException;


public class ConexionArduino {
    private SerialPort puerto;
    
    public ConexionArduino() {
        try {   // Se intenta realizar la conexión con el puerto serial, si se logra conectar ejecutará el siguiente código
            puerto = new SerialPort("/dev/ttyACM0");   // Se especifica el puerto al que se trata de conectar
            puerto.openPort();   // Se inicializa el puerto
            puerto.setParams(SerialPort.BAUDRATE_9600, SerialPort.DATABITS_8, SerialPort.STOPBITS_1, SerialPort.PARITY_NONE);   // Se establecen los parámetros que tendrá la conexión
        } catch (SerialPortException e) {   // En caso de que no se haya podido conectar, ejecutará el siguiente código
            System.out.println(e.getMessage());
        }
    }
    
    public void mandarMensaje(String valor) {
        try {
            puerto.writeString(valor);
            System.out.println(valor);
        } catch (SerialPortException e) {
            System.out.println(e.getMessage());
        }
    }
}
