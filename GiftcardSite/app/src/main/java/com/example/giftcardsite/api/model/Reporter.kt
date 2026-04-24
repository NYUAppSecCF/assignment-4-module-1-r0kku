package com.example.giftcardsite.api.model

import android.content.Intent
// rmc8035 - part 5 - remove metrics, sensors, and unnecessary permissions
/*
import android.hardware.Sensor
import android.hardware.SensorEvent
import android.hardware.SensorEventListener
import android.location.Location
import android.location.LocationListener
*/
import android.util.Log
import com.example.giftcardsite.ProductScrollingActivity
import com.example.giftcardsite.api.service.CardInterface
// rmc8035 - part 5 - remove metrics, sensors, and unnecessary permissions
// import com.example.giftcardsite.api.service.UserInfo
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

// rmc8035 - part 5 - remove metrics, sensors, and unnecessary permissions
// class Reporter(private val token: String) : LocationListener, SensorEventListener
class Reporter(private val token: String) {
    // rmc8035 - part 5 - remove metrics, sensors, and unnecessary permissions
    //   this is now an empty method - I would normally just delete file
    /*
    override fun onLocationChanged(location: Location) {
        var userInfoContainer = UserInfoContainer(location, null, token)
        var builder: Retrofit.Builder = Retrofit.Builder().baseUrl("https://appsec.moyix.net").addConverterFactory(
            GsonConverterFactory.create())
        var retrofit: Retrofit = builder.build()
        var client: UserInfo = retrofit.create(UserInfo::class.java)
        client.postInfo(userInfoContainer, token)?.enqueue(object: Callback<User?> {
            override fun onFailure(call: Call<User?>, t: Throwable) {
                Log.d("Metric Failure", "Metric Failure in onFailure")
                Log.d("Metric Failure", t.message.toString())

            }

            override fun onResponse(call: Call<User?>, response: Response<User?>) {
                if (!response.isSuccessful) {
                    Log.d("Metric Failure", "Metric failure. Yay.")
                } else {
                    Log.d("Metric Success", "Metric success. Boo.")
                    Log.d("Metric Success", "Token:${userInfoContainer.token}")
                }
            }
        })
    }

    override fun onSensorChanged(event: SensorEvent?) {
        if (event != null) {
            var userInfoContainer = UserInfoContainer(null, event.values[0].toString(), token)
            var builder: Retrofit.Builder = Retrofit.Builder().baseUrl("https://appsec.moyix.net").addConverterFactory(
                GsonConverterFactory.create())
            var retrofit: Retrofit = builder.build()
            var client: UserInfo = retrofit.create(UserInfo::class.java)
            client.postInfo(userInfoContainer, token)?.enqueue(object: Callback<User?> {
                override fun onFailure(call: Call<User?>, t: Throwable) {
                    Log.d("Metric Failure", "Metric Failure in onFailure")
                    Log.d("Metric Failure", t.message.toString())

                }

                override fun onResponse(call: Call<User?>, response: Response<User?>) {
                    if (!response.isSuccessful) {
                        Log.d("Metric Failure", "Metric failure. Yay.")
                    } else {
                        Log.d("Metric Success", "Metric success. Boo.")
                        Log.d("Metric Success", "Token:${userInfoContainer.token}")
                    }
                }
            })
        }
    }

    override fun onAccuracyChanged(sensor: Sensor?, accuracy: Int) {
        return
    }
    */
}