package com.example.callapiretrofit.data

import retrofit2.http.GET


interface RetrofitService {

    @GET("posts")
    suspend fun getByPost():ArrayList<DataResponsive>



}
