package com.example.vdmoviesapp.data.local.converter

import androidx.room.TypeConverter
import com.example.vdmoviesapp.data.remote.Cast
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class CastListTypeConverter {

    @TypeConverter
    fun fromString(value: String): List<Cast>? {
        val listType = object : TypeToken<List<Cast>>() {}.type
        return Gson().fromJson<List<Cast>>(value, listType)
    }

    @TypeConverter
    fun fromList(list: List<Cast>?): String {
        val gson = Gson()
        return gson.toJson(list)
    }
}
