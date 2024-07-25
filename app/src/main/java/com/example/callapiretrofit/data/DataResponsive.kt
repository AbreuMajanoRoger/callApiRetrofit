package com.example.callapiretrofit.data

import com.google.gson.annotations.SerializedName

data class DataResponsive(

    @SerializedName("userId") var userId: Int,
    @SerializedName("id") var id: Int,
    @SerializedName("title") var title: String,
    @SerializedName("body") var body: String
)
