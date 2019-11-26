package com.example.vdmoviesapp.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.vdmoviesapp.data.local.converter.*
import com.example.vdmoviesapp.data.local.dao.MovieDao
import com.example.vdmoviesapp.data.local.dao.TvDao
import com.example.vdmoviesapp.data.local.entity.MovieEntity
import com.example.vdmoviesapp.data.local.entity.TvEntity

@Database(entities = [MovieEntity::class, TvEntity::class], version = 1, exportSchema = false)
@TypeConverters(
    GenreListTypeConverter::class,
    VideoListTypeConverter::class,
    CreditResponseTypeConverter::class,
    MovieListTypeConverter::class,
    CastListTypeConverter::class,
    CrewListTypeConverter::class,
    StringListConverter::class,
    TvListTypeConverter::class
)
abstract class AppDatabase : RoomDatabase() {

    abstract fun movieDao(): MovieDao

    abstract fun tvDao(): TvDao
}