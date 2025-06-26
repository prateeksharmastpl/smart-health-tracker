package com.mrprateek.smarthealth.ble

import android.bluetooth.*
import android.bluetooth.le.*
import android.content.Context
import android.os.ParcelUuid
import kotlinx.coroutines.flow.MutableStateFlow
import java.util.*

class BleManager(private val context: Context) {
    val connectedDevice = MutableStateFlow<BluetoothDevice?>(null)
    private var bluetoothGatt: BluetoothGatt? = null

    fun startScan(scanCallback: ScanCallback) {
        val scanner = BluetoothAdapter.getDefaultAdapter().bluetoothLeScanner
        val filters = listOf(ScanFilter.Builder().build())
        val settings = ScanSettings.Builder().setScanMode(ScanSettings.SCAN_MODE_LOW_LATENCY).build()
        scanner.startScan(filters, settings, scanCallback)
    }

    fun stopScan(scanCallback: ScanCallback) {
        BluetoothAdapter.getDefaultAdapter().bluetoothLeScanner.stopScan(scanCallback)
    }

    fun connect(device: BluetoothDevice) {
        bluetoothGatt = device.connectGatt(context, false, object : BluetoothGattCallback() {
            override fun onConnectionStateChange(gatt: BluetoothGatt, status: Int, newState: Int) {
                if (newState == BluetoothProfile.STATE_CONNECTED) {
                    connectedDevice.value = device
                    gatt.discoverServices()
                }
            }

            override fun onServicesDiscovered(gatt: BluetoothGatt, status: Int) {
                // handle services
            }

            override fun onCharacteristicChanged(gatt: BluetoothGatt, characteristic: BluetoothGattCharacteristic) {
                // handle notification updates
            }
        })
    }

    fun disconnect() {
        bluetoothGatt?.disconnect()
    }
}