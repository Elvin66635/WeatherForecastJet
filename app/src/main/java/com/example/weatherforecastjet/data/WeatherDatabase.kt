package com.example.weatherforecastjet.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.weatherforecastjet.model.Favorite
import com.example.weatherforecastjet.model.Unit

@Database(entities = [Favorite::class, Unit::class], version = 2, exportSchema = false)
abstract class WeatherDatabase : RoomDatabase() {
    abstract fun weatherDao(): WeatherDao
}