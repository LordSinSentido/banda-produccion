#include <SPI.h>   // Librería SPI para comunicacion con el modulo
#include <RH_NRF24.h>   // Librería RadioHead para controlar la antena nrf24

#define pin1 2   // Se define que "pin1" vale 2
#define pin2 3   // Se define que "pin2" vale 3

RH_NRF24 nrf24;   // Se crea el objeto de la antena

bool listoParaRecibir = true;   // Variable para corroborar que el dispositivo fue inicializado exitosamente
char estadoDeLaBanda = "0";   // Variable donde se guardará el estado de la banda: 0, apagado; 1, encendido

void setup() {
  // Inicializamos los pines de salida
  pinMode(pin1, OUTPUT);
  pinMode(pin2, OUTPUT);
  
  // Iniciamos la comunicación con el puerto serie
  Serial.begin(9600);
  
  // Inicializamos la conexión con la antena
  if (!nrf24.init()) {   // Se verifica que la conexión se realice, si no, se ejecuta el siguiente código
    Serial.println("No se pudo conectar con la antena");   // Se le informa al usuario mediante un mensaje
    listoParaRecibir = false;   // Se establece que el dispositivo no está listo para transmitir
  }

  // Inicializamos el canal que se utilizará para comunicarnos con las demás antenas
  if (!nrf24.setChannel(2)) {   // Se verifica que el canal se establezca, si no, se ejecuta el siguiente código
    Serial.println("No se pudo establecer el canal de transmisión");   // Se le informa al usuario mediante un mensaje
    listoParaRecibir = false;   // Se establece que el dispositivo no está listo para transmitir
  }

  // Inicializamos los parámetros de enlace con las demás antenas
  if (!nrf24.setRF(RH_NRF24::DataRate2Mbps, RH_NRF24::TransmitPower0dBm)) {   // Se verifica que los parámetros se establezcan, si no, se ejecuta el siguiente código
    Serial.println("No se pudo configurar la transmisión");   // Se le informa al usuario mediante un mensaje
    listoParaRecibir = false;   // Se establece que el dispositivo no está listo para transmitir
  }

  // Confirmamos que el dispositivo esté listo
  if(listoParaRecibir) {   // Verificamos que el dispositivo esté listo para recibir, si es así, ejecutamos el siguiente código
    Serial.println("Listo para recibir...");   // Se le informa al usuario mediante un mensaje
  }else{   // En caso contrario, se ejecuta el siguiente código
    Serial.println("Hubo un problema, verifique la conexión y los datos y vuelva a intentar.");
  }
}


void loop() {
  if(nrf24.available()) {
    uint8_t buf[RH_NRF24_MAX_MESSAGE_LEN];
    uint8_t len = sizeof(buf);

    if(nrf24.recv(buf, &len)) {
      Serial.print("Se recibió: ");
      Serial.println((char*)buf);
      
      estadoDeLaBanda = (char*)buf;

      if(estadoDeLabanda == '0') {
        digitalWrite(pin1, LOW);
        digitalWrite(pin2, HIGH);
      }

      if(estadoDeLaBanda == '1') {
        digitalWrite(pin1, HIGH);
        digitalWrite(pin2, LOW);
      }
      
    }else{
      Serial.println("Los datos no se recibieron correctamente...");
    }
  }
}
