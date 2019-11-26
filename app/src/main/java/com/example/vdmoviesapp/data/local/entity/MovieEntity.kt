package com.example.vdmoviesapp.data.local.entity

import android.os.Parcel
import android.os.Parcelable
import androidx.room.Entity
import androidx.room.TypeConverters
import com.example.vdmoviesapp.data.local.converter.*
import com.example.vdmoviesapp.data.remote.Cast
import com.example.vdmoviesapp.data.remote.Crew
import com.example.vdmoviesapp.data.remote.Genre
import com.example.vdmoviesapp.data.remote.Video
import com.example.vdmoviesapp.utils.AppConstants
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize
import java.util.ArrayList

@Parcelize
@Entity(primaryKeys = ["id"])
data class MovieEntity(
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

    @TypeConverters(GenreListTypeConverter::class)
    var genres: List<Genre>? = ArrayList(),

    @SerializedName("videos")
    @TypeConverters(VideoListTypeConverter::class)
    var videos: List<Video>? = ArrayList(),


    @TypeConverters(StringListConverter::class)
    var categoryTypes: List<String>? = ArrayList(),

    @TypeConverters(CrewListTypeConverter::class)
    var crews: List<Crew>? = ArrayList(),

    @TypeConverters(CastListTypeConverter::class)
    var casts: List<Cast>? = ArrayList(),

    @TypeConverters(MovieListTypeConverter::class)
    var similarMovies: List<MovieEntity>? = ArrayList(),

    @SerializedName("runtime")
    var runTime: Long,
    var status: String?
) : Parcelable
