package com.example.retrofittest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import org.json.JSONObject
import retrofit2.*
import retrofit2.converter.gson.GsonConverterFactory
import java.lang.StrictMath.log
import kotlin.math.log

class MainActivity : AppCompatActivity() {

    private var retrofitData: TextView? = null
    val URL: String = "http://sandartp4u.com/_include/data/"
    var contry: String = "english"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        retrofitData = findViewById(R.id.textView)

        findViewById<View>(R.id.button1).setOnClickListener{getCurrentData()}
//        getFun()
    }

    internal fun getCurrentData() {

        val retrofit = Retrofit.Builder().baseUrl(URL).addConverterFactory(GsonConverterFactory.create()).build()
        val service = retrofit.create(RetrofitService::class.java)
        val call = service.getJsonData(contry)
        call.enqueue(object : Callback<RetrofitResponse> {
            override fun onResponse(call: Call<RetrofitResponse>, response: Response<RetrofitResponse>) {
                if (response.code() == 200) { // http 요청이 성공적으로 되었다.

                    val retrofitResponse = response.body()!!
                    //val retrofitResponse = response.body()!!.data.toString()
                    var stringBuilder = retrofitResponse.data!!.english!!.link

                    //fun <T> tryNull(block:() -> T) = try{block()}catch(e:Throwable){null}
                    //fun JSONObject._object(key:String):JSONObject? = this.getJSONObject("contry")
                    //fun JSONObject._string(key:String):String? = this.getString("link")


                    //tryNull { JSONObject(retrofitResponse) }?.let{
                    //    var stringBuilder:String? = it._object(contry)!!._string("link")
                    //    var videoName = stringBuilder!!.substringAfterLast("/")
                    //    retrofitData!!.text = videoName
                    //}

                    val filePath:String = "http://cccvlm6.myqnapcloud.com/sandartp4u/"
                    var videoName = stringBuilder!!.substringAfterLast("/")

                    retrofitData!!.text = videoName
                }
            }

            override fun onFailure(call: Call<RetrofitResponse>, t: Throwable) {
                retrofitData!!.text = t.message
            }

        })
    }

    /*
    private fun getFun() {

        val retrofit = Retrofit.Builder().baseUrl(URL).addConverterFactory(GsonConverterFactory.create()).build()
        val service = retrofit.create(RetrofitService::class.java)
        val call = service.getJsonData("Korean")
        call.enqueue(object : Callback<RetrofitResponse> {
            override fun onResponse(call: Call<RetrofitResponse>, response: Response<RetrofitResponse>) {
                if (response.code() == 200){ // http 요청이 성공적으로 되었다.
                    val retrofitResponse = response.body()!!

//                    val stringBuilder = "한국링크:" + retrofitResponse.Data!!.Korean!!.Link
                    val stringBuilder = "Response: " + retrofitResponse.data!!.korean!!.link
//                    val stringBuilder = "Response: " + retrofitResponse.version

                    retrofitData!!.setText(stringBuilder)

                }
            }

            override fun onFailure(call: Call<RetrofitResponse>, t: Throwable) {
                retrofitData!!.setText("실패!!"+t.message)
            }
        })

    }

    */
}
