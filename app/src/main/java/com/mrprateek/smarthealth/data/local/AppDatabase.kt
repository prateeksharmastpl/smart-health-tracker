package com.mrprateek.smarthealth.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.mrprateek.smarthealth.data.model.HealthReading

@Database(entities = [HealthReading::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun healthDao(): HealthDao
}