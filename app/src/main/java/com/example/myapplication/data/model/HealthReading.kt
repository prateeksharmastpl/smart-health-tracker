package com.yourname.smarthealth.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class HealthReading(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val timestamp: Long,
    val heartRate: Int,
    val temperature: Float
)