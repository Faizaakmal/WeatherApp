package com.example.weather.Retrofit;

import com.example.weather.Model.WeatherModel;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiEndpoint {
    @GET("current.json?key=9cab3894b1c849f6b5a65058210906&q=Jakarta&aqi=no")
    Call<WeatherModel> getData();
    @GET("forecast.json?key=9cab3894b1c849f6b5a65058210906&q=Jakarta&days=4&aqi=no&alerts=no")
    Call<WeatherModel> getForecast();
}
