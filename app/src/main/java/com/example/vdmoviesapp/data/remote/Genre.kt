package com.example.vdmoviesapp.data.remote

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Genre(
    val id: Long,
    val name: String
) : Parcelable