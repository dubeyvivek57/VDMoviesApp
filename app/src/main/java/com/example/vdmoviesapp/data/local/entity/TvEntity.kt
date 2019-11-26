package com.example.vdmoviesapp.data.local.entity

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.TypeConverters
import com.example.vdmoviesapp.data.local.converter.*
import com.example.vdmoviesapp.data.remote.model.Cast
import com.example.vdmoviesapp.data.remote.model.Crew
import com.example.vdmoviesapp.data.remote.model.Genre
import com.example.vdmoviesapp.data.remote.model.Video
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize
import java.util.*

@Parcelize
@Entity(primaryKeys = ["id"])
data class TvEntity(
    @SerializedName("id")
    val id: Long,

    var page: Long,
    var totalPages: Long,

    @SerializedName(value = "header", alternate = ["title", "name"])
    val header: String,

    @SerializedName("poster_path")
    var posterPath: String?,

    @SerializedName(value = "description", alternate = ["overview", "synopsis"])
    var description: String?,

    @SerializedName("release_date")
    var releaseDate: String?,

    @SerializedName("genres")
    var genres: List<Genre>? = ArrayList(),

    @SerializedName("videos")
    @TypeConverters(VideoListTypeConverter::class)
    var videos: List<Video>? = ArrayList(),

    @TypeConverters(CrewListTypeConverter::class)
    var crews: List<Crew>? = ArrayList(),

    @TypeConverters(CastListTypeConverter::class)
    var casts: List<Cast>? = ArrayList(),

    @TypeConverters(StringListConverter::class)
    var categoryTypes: List<String>? = ArrayList(),

    @TypeConverters(TvListTypeConverter::class)
    var similarTvEntities: List<TvEntity>? = ArrayList(),

    @SerializedName("number_of_seasons")
    var numberOfSeasons: Long?,
    var status: String?
) : Parcelable