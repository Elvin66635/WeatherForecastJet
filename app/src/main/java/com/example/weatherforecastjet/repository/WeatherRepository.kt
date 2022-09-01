package com.example.weatherforecastjet.repository

import com.example.weatherforecastjet.data.DataOrException
import com.example.weatherforecastjet.model.Weather
import com.example.weatherforecastjet.model.WeatherObject
import com.example.weatherforecastjet.network.WeatherApi
import javax.inject.Inject

class WeatherRepository @Inject constructor(private val api: WeatherApi) {

    suspend fun getWeather(cityQuery: String): DataOrException<Weather, Boolean, Exception> {

        val response = try {
            api.getWeather(query = cityQuery)
        }catch (e: Exception){
            return DataOrException(e = e)
        }
        return DataOrException(data = response)
    }
}