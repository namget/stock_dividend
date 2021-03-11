package com.namget.stock.know.repository

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.namget.stock.know.data.BuildConfig
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

class RetrofitBuilder {

    private fun setHeadInterceptor(): Interceptor =
        Interceptor {
            val original = it.request()
            val request = original.newBuilder()
                .method(original.method, original.body)
                .build()
            it.proceed(request)
        }


    private fun getHttpInterceptor(): Interceptor = HttpLoggingInterceptor().apply {
        level = if (BuildConfig.DEBUG) {
            HttpLoggingInterceptor.Level.BODY
        } else {
            HttpLoggingInterceptor.Level.NONE
        }
    }


    private fun getGsonBuilder(): Gson = GsonBuilder().setLenient().create()


    private fun setOkhttp(): OkHttpClient =
        OkHttpClient.Builder().addInterceptor(setHeadInterceptor())
            .addInterceptor(getHttpInterceptor())
            .writeTimeout(TIMEOUT, TimeUnit.SECONDS)
            .readTimeout(TIMEOUT, TimeUnit.SECONDS)
            .connectTimeout(TIMEOUT, TimeUnit.SECONDS)
            .build()


    private fun getRetrofit(): Retrofit =
        Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create(getGsonBuilder()))
            .client(setOkhttp())
            .baseUrl(BASE_URL)
            .build()

    fun <T> create(clazz: Class<T>) : T = getRetrofit().create(clazz)

    companion object {
        private const val TIMEOUT = 3L
        private const val BASE_URL = "http://apis.data.go.kr/1160100/"
    }
}