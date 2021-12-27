package com.nurmalitasari.etha.models

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
//mrmbuat class MovieResponse
data class MovieResponse(
    //memanggil results yang terdapat pada API
    @SerializedName("results")
    val movies : List<Movie>

) : Parcelable {
    //untuk menginisiasi variabel pada objek
    constructor() : this(mutableListOf())
}