package com.example.vdmoviesapp.data.remote.model

import android.os.Parcelable
import androidx.room.TypeConverters
import com.example.vdmoviesapp.data.local.converter.CastListTypeConverter
import com.example.vdmoviesapp.data.local.converter.CrewListTypeConverter
import kotlinx.android.parcel.Parcelize
import java.util.ArrayList

@Parcelize
data class CreditResponse(
    @TypeConverters(CrewListTypeConverter::class)
    var crew: List<Crew> = ArrayList(),
    @TypeConverters(CastListTypeConverter::class)
    var cast: List<Cast> = ArrayList()
):Parcelable