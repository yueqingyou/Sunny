package vccv.cc.yuesir.sunny

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

class SunnyWeatherApplication: Application() {
    companion object {
        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context

        const val TOKEN = "eGaJJvZdFwxK1u3d"
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}