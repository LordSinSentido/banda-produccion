#include <SPI.h>
#include <RH_NRF24.h>

RH_NRF24 nrf24;

bool listoParaTransmitir = true;

void setup() {
  Serial.begin(9600);
  pinMode(LED_BUILTIN, OUTPUT);

  if (!nrf24.init()) {
    Serial.println("No se pudo conectar con la antena");
    listoParaTransmitir = false;
  }

  if (!nrf24.setChannel(2)) {
    Serial.println("No se pudo establecer el canal de transmisión");
    listoParaTransmitir = false;
  }

  if (!nrf24.setRF(RH_NRF24::DataRate2Mbps, RH_NRF24::TransmitPower0dBm)) {
    Serial.println("No se pudo configurar la transmisión");
    listoParaTransmitir = false;
  }

  if(listoParaTransmitir) {
    Serial.println("Listo para transmitir...");
  }else{
    Serial.println("Hubo un problema, verifique la conexión y los datos y vuelva a intentar.");
  }
  
}

void loop() {
  
  if(Serial.available() > 0) {
    int estado = Serial.parseInt();

    switch(estado) {
      case 1:
        digitalWrite(LED_BUILTIN, HIGH);
        apagar();
        delay(1000);
        digitalWrite(LED_BUILTIN, LOW);
        break;

      case 2:
        digitalWrite(LED_BUILTIN, HIGH);
        encender();
        delay(200);
        digitalWrite(LED_BUILTIN, LOW);
        break;
    }
  }
}

void apagar() {
  uint8_t mensaje[] = "0";
  Serial.print("Se envió: ");
  Serial.println((char*)mensaje);
  nrf24.send(mensaje, sizeof(mensaje));
  nrf24.waitPacketSent();
}

void encender() {
  uint8_t mensaje[] = "1";
  Serial.print("Se envió: ");
  Serial.println((char*)mensaje);
  nrf24.send(mensaje, sizeof(mensaje));
  nrf24.waitPacketSent();
}
