#include <SPI.h>
#include <RH_NRF24.h>

#define salida 2

RH_NRF24 nrf24;

bool listoParaRecibir = true;
String estadoDeLaBanda = "";

void setup() {
  pinMode(salida, OUTPUT);

  Serial.begin(9600);
  
  if (!nrf24.init()) {
    Serial.println("No se pudo conectar con la antena");
    listoParaRecibir = false;
  }

  if (!nrf24.setChannel(2)) {
    Serial.println("No se pudo establecer el canal de transmisión");
    listoParaRecibir = false;
  }

  if (!nrf24.setRF(RH_NRF24::DataRate2Mbps, RH_NRF24::TransmitPower0dBm)) {
    Serial.println("No se pudo configurar la transmisión");
    listoParaRecibir = false;
  }

  if(listoParaRecibir) {
    Serial.println("Listo para recibir...");
  }else{
    Serial.println("Hubo un problema, verifique la conexión y los datos y vuelva a intentar.");
  }
}


void loop() {
  if(nrf24.available()) {
    uint8_t buf[RH_NRF24_MAX_MESSAGE_LEN];
    uint8_t len = sizeof(buf);

    if(nrf24.recv(buf, &len)) {

      estadoDeLaBanda = (char*)buf;

      if(estadoDeLaBanda == "0") {
        Serial.println("Apagando banda...");
        digitalWrite(salida, HIGH);
      }

      if(estadoDeLaBanda == "1") {
        Serial.println("Encendiendo banda...");
        digitalWrite(salida, LOW);
      }
      
    }else{
      Serial.println("Los datos no se recibieron correctamente...");
    }
  }
}
