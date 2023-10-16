package com.lsegura.bol2ej1.model

import android.os.Parcelable

data class Movie    (
    val title: String = "",
    val urlImagen: String = "",
    val description: String = "",
    val original_languague: String = "",
    val title_original: String = "",
    val valoracion: Double = 0.0
)