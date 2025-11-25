#define MQ2_DIGITAL D0
#define MQ2_ANALOG  A0
#define LED_PIN     D3

void setup() {
  Serial.begin(9600);

  pinMode(MQ2_DIGITAL, INPUT);
  pinMode(MQ2_ANALOG, INPUT);
  pinMode(LED_PIN, OUTPUT);

  digitalWrite(LED_PIN, LOW);

  Serial.println("=== MQ-2 Sensor Started ===");
  Serial.println("Monitoring analog + digital...");
}

void loop() {
  int analogValue = analogRead(MQ2_ANALOG);   // 0-1023
  int digitalValue = digitalRead(MQ2_DIGITAL); // HIGH/LOW

  Serial.print("Analog: ");
  Serial.print(analogValue);
  Serial.print(" | Digital: ");
  Serial.println(digitalValue);

  // LED indikator berdasarkan digital output
  if (digitalValue == LOW) {  // sebagian modul MQ-2 digital LOW saat gas terdeteksi
    digitalWrite(LED_PIN, HIGH);
  } else {
    digitalWrite(LED_PIN, LOW);
  }

  delay(300);
}
