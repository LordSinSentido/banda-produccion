#include <SPI.h>   // Librería SPI para comunicacion con el modulo
#include <RH_NRF24.h>   // Librería RadioHead para controlar la antena nrf24

RH_NRF24 nrf24;   // Se crea el objeto de la antena

bool listoParaTransmitir = true;   // Variable para corroborar que el dispositivo fue inicializado exitosamente
char estadoDeLaBanda = "0";   // Variable donde se guardará el estado de la banda: 0, apagado; 1, encendido

void setup() {
  // Iniciamos la comunicación con el puerto serie
  Serial.begin(9600);

  // Inicializamos la conexión con la antena
  if (!nrf24.init()) {   // Se verifica que la conexión se realice, si no, se ejecuta el siguiente código
    Serial.println("No se pudo conectar con la antena");   // Se le informa al usuario mediante un mensaje
    listoParaTransmitir = false;   // Se establece que el dispositivo no está listo para transmitir
  }

  // Inicializamos el canal que se utilizará para comunicarnos con las demás antenas
  if (!nrf24.setChannel(2)) {   // Se verifica que el canal se establezca, si no, se ejecuta el siguiente código
    Serial.println("No se pudo establecer el canal de transmisión");   // Se le informa al usuario mediante un mensaje
    listoParaTransmitir = false;   // Se establece que el dispositivo no está listo para transmitir
  }

  // Inicializamos los parámetros de enlace con las demás antenas
  if (!nrf24.setRF(RH_NRF24::DataRate2Mbps, RH_NRF24::TransmitPower0dBm)) {   // Se verifica que los parámetros se establezcan, si no, se ejecuta el siguiente código
    Serial.println("No se pudo configurar la  transmisión");   // Se le informa al usuario mediante un mensaje
    listoParaTransmitir = false;   // Se establece que el dispositivo no está listo para transmitir
  }

  // Confirmamos que el dispositivo esté listo
  if(listoParaTransmitir) {   // Verificamos que el dispositivo esté listo para transmitir, si es así, ejecutamos el siguiente código
    Serial.println("Listo para transmitir...");   // Se le informa al usuario mediante un mensaje
  }else{   // En caso contrario, se ejecuta el siguiente código
    Serial.println("Hubo un problema, verifique la conexión y los datos y vuelva a intentar.");
  }
  
}

void loop() {
  while(Serial.available() == 0) {   // Se comprueba que haya datos en el puerto serial
    // No se ejecuta nada hasta que se rompa el ciclo
  }

  estadoDeLaBanda = Serial.read();   // Se guarda el dato entrante en la variable

  if(estadoDeLaBanda == '\n') {   // Se comprueba que haya un salto de línea, si es así, se ejecuta el siguiente código
    // No se ejecuta nada
  }
  
  if(estadoDeLaBanda == '0') {
    uint8_t mensaje[] = "0";
    Serial.print("Se envió: ");
    Serial.println((char*)mensaje);
    nrf24.send(mensaje, sizeof(mensaje));
    nrf24.waitPacketSent();
    
  }

  if(estadoDeLaBanda == '1') {
    uint8_t mensaje[] = "1";
    Serial.print("Se envió: ");
    Serial.println((char*)mensaje);
    nrf24.send(mensaje, sizeof(mensaje));
    nrf24.waitPacketSent();
    
  }
}
