package com.example.vdmoviesapp.data.local.converter

import androidx.room.TypeConverter
import com.example.vdmoviesapp.data.local.entity.TvEntity
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class TvListTypeConverter {

    @TypeConverter
    fun fromString(value: String): List<TvEntity>? {
        val listType = object : TypeToken<List<TvEntity>>() {}.type
        return Gson().fromJson<List<TvEntity>>(value, listType)
    }

    @TypeConverter
    fun fromList(list: List<TvEntity>?): String {
        val gson = Gson()
        return gson.toJson(list)
    }
}