package vccv.cc.yuesir.sunny.logic.network

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query
import vccv.cc.yuesir.sunny.SunnyWeatherApplication
import vccv.cc.yuesir.sunny.logic.model.PlaceResponse

interface PlaceService {

    @GET("v2/place?token=${SunnyWeatherApplication.TOKEN}&lang=zh_CN")
    fun searchPlaces(@Query("query") query: String): Call<PlaceResponse>

}