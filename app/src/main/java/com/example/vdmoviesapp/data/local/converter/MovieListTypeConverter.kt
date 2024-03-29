package com.example.vdmoviesapp.data.local.converter

import androidx.room.TypeConverter
import com.example.vdmoviesapp.data.local.entity.MovieEntity
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class MovieListTypeConverter {

    @TypeConverter
    fun fromString(value: String): List<MovieEntity>? {
        val listType = object : TypeToken<List<MovieEntity>>() {}.type
        return Gson().fromJson<List<MovieEntity>>(value, listType)
    }

    @TypeConverter
    fun fromList(list: List<MovieEntity>?): String {
        val gson = Gson()
        return gson.toJson(list)
    }
}