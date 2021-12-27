package com.nurmalitasari.etha.models

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize


@Parcelize
//membuat class Movie
data class Movie(
    //memanggil id yang terdapat pada API
    @SerializedName("id")
    val id : String ?,

    //memanggil title yang terdapat pada API
    @SerializedName("title")
    val title : String?,

    //memanggil poster_path yang terdapat pada API
    @SerializedName("poster_path")
    val poster : String?,

    //memanggil release_data yang terdapat pada API
    @SerializedName("release_date")
    val release : String?

) : Parcelable{
    //untuk menginisiasi variabel pada objek
    constructor() : this("", "", "", "")
}