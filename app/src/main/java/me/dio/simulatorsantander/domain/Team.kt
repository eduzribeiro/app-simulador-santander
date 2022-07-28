package me.dio.simulatorsantander.domain

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class Team(
    @SerializedName("nome")
    val name:String,
    @SerializedName("força")
    val stars:Int,
    @SerializedName("imagem")
    val image:String,
    var score:Int?
):Parcelable
