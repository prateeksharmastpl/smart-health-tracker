package com.mrprateek.smarthealth.data.local

import androidx.room.*
import com.mrprateek.smarthealth.data.model.HealthReading
import kotlinx.coroutines.flow.Flow

@Dao
interface HealthDao {
    @Insert
    suspend fun insert(reading: HealthReading)

    @Query("SELECT * FROM HealthReading ORDER BY timestamp DESC")
    fun getAll(): Flow<List<HealthReading>>
}