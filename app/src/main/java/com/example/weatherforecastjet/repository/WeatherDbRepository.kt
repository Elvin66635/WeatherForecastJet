package com.example.weatherforecastjet.repository

import com.example.weatherforecastjet.data.WeatherDao
import com.example.weatherforecastjet.model.City
import com.example.weatherforecastjet.model.Favorite
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class WeatherDbRepository @Inject constructor(private val weatherDao: WeatherDao) {

    fun getFavorites(): Flow<List<Favorite>> = weatherDao.getFavorites()

    suspend fun insertFavorite(favorite: Favorite) =
        weatherDao.insertFavorite(favorite)

    suspend fun updateFavorite(favorite: Favorite) =
        weatherDao.updateFavorite(favorite)

    suspend fun deleteAllFavorite() = weatherDao.deleteAllFavorites()

    suspend fun deleteFavorite(favorite: Favorite) =
        weatherDao.deleteFavorite(favorite)

    suspend fun getCityById(city: String) =
        weatherDao.getFavById(city)
}