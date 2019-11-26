package com.example.vdmoviesapp.data.remote.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class VideoResponse(
    var id: Long = 0,
    var results: List<Video>? = null
):Parcelable