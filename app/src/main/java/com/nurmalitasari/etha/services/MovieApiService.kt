package com.nurmalitasari.etha.services

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MovieApiService {

    companion object{
        //URL pada website
        private const val BASE_URL = "https://api.themoviedb.org"
        private var retrofit : Retrofit? = null

        //Membuat objek Retrofit
        fun getInstance() : Retrofit{
            if(retrofit == null){
                retrofit = Retrofit.Builder()
                    .baseUrl(BASE_URL)
                     //memanggil addConverterFactory
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
            }
            return retrofit!!
        }
    }
}