package com.example.weatherforecastjet.network

import com.example.weatherforecastjet.model.Weather
import com.example.weatherforecastjet.model.WeatherObject
import com.example.weatherforecastjet.utils.Constants
import retrofit2.http.GET
import retrofit2.http.Query
import javax.inject.Singleton

@Singleton
interface WeatherApi {
    @GET(value = "data/2.5/forecast/daily")
    suspend fun getWeather(
        @Query("q") query : String,
        @Query("units") units: String = "imperial",
        @Query("appid") appid: String = Constants.API_KEY
    ): Weather
}