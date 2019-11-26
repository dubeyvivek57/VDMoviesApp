package com.example.vdmoviesapp.data.remote

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Video(
    val id: String,
    val key: String
) : Parcelable
