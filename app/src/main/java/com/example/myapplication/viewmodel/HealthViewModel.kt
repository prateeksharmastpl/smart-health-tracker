package com.yourname.smarthealth.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.yourname.smarthealth.data.model.HealthReading
import com.yourname.smarthealth.data.repository.HealthRepository
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch

class HealthViewModel(private val repository: HealthRepository) : ViewModel() {
    val healthData: StateFlow<List<HealthReading>> = repository.getAllReadings().stateIn(
        viewModelScope, SharingStarted.WhileSubscribed(), emptyList()
    )

    fun insertReading(reading: HealthReading) {
        viewModelScope.launch {
            repository.insertReading(reading)
        }
    }
}