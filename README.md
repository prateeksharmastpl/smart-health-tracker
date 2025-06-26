
# Smart Health Tracker 🩺📱

A modern **Android app built with Jetpack Compose** that connects to BLE (Bluetooth Low Energy) devices like fitness bands or health sensors. It helps track and visualize real-time **heart rate**, **temperature**, and **step count**, with a clean and responsive Compose UI.

---

## 🚀 Features

- 🔍 Scan and connect to BLE devices
- 📡 Read real-time data from sensors (Heart rate, Temperature, Steps)
- 📊 Display trends with charts and historical data
- 🧠 Uses Jetpack Compose for all UI
- 🏥 Health alerts with threshold-based notifications
- 🗃️ Room DB for local data persistence
- 🔐 Encrypted SharedPreferences/DataStore for secure settings
- 🧪 Unit + UI testing ready
- 🛠️ Modular MVVM architecture with Hilt for DI
- ☁️ GitHub Actions CI/CD support (optional)

---

## 🧱 Architecture

```
MVVM + Repository pattern
|
|-- View (Jetpack Compose)
|-- ViewModel (HealthViewModel)
|-- Repository (HealthRepository)
|-- BLE Layer (BleManager, GATT callbacks)
|-- Room DB (HealthReading, DAO)
```

---

## 📸 Screenshots

_👉 Add screenshots or GIFs of dashboard, history, graph view here_

---

## 🔧 Tech Stack

- Jetpack Compose (Material 3)
- BLE API (BluetoothGatt, Scanner)
- Kotlin Coroutines + Flow + StateFlow
- Room Database
- Hilt Dependency Injection
- MPAndroidChart / Compose chart alternative
- EncryptedSharedPreferences / Jetpack Security
- GitHub Actions (CI/CD pipeline)

---

## 🛠️ How to Run

1. Clone the repository  
   `git clone https://github.com/yourname/smart-health-tracker.git`

2. Open in **Android Studio Hedgehog or newer**

3. Run on a real device (BLE won't work properly on most emulators)

4. Connect to any BLE fitness band / mock BLE server

---

## ✍️ Author

Mr Prateek  
Android & React Native Developer 
[LinkedIn](https://www.linkedin.com/in/mr-p-56a6b6253) | [Portfolio](https://mrprateek.com)

---

## 📅 Created on

June 26, 2025

