package com.example.mysunnyweather.logic.network

import com.example.mysunnyweather.SunnyWeatherApplication
import com.example.mysunnyweather.logic.model.PlaceResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface PlaceService {
    //https://api.caiyunapp.com/   baseUrl
    //v2/place?query=北京&token={token}$lang=zh_CN
    @GET("v2/place?token=${SunnyWeatherApplication.TOKEN}&lang=zh_CN")
    fun searchPlaces(@Query("query") query:String): Call<PlaceResponse>

}