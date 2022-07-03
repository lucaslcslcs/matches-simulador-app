package me.dio.matches_simulador_app.domain

import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize
import android.os.Parcelable as Parcelable

@Parcelize
data class Team(
    @SerializedName("nome")
    val name:String,
    @SerializedName("forca")
    val stars: Int,
    @SerializedName("imagem")
    val image: String,
    var score: Int?
    ) : Parcelable