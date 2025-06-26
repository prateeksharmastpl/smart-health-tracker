package com.yourname.smarthealth.data.repository

import com.yourname.smarthealth.data.local.HealthDao
import com.yourname.smarthealth.data.model.HealthReading
import kotlinx.coroutines.flow.Flow

class HealthRepository(private val dao: HealthDao) {
    suspend fun insertReading(reading: HealthReading) = dao.insert(reading)
    fun getAllReadings(): Flow<List<HealthReading>> = dao.getAll()
}