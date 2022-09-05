package com.example.weatherforecastjet.screens.main

import androidx.lifecycle.ViewModel
import com.example.weatherforecastjet.data.DataOrException
import com.example.weatherforecastjet.model.Weather
import com.example.weatherforecastjet.repository.WeatherRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val repository: WeatherRepository) : ViewModel() {

    suspend fun getWeatherData(city: String, units: String): DataOrException<Weather, Boolean, Exception> {
            return repository.getWeather(cityQuery = city, units = units)
    }

}