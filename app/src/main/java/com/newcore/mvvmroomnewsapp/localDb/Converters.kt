package com.newcore.mvvmroomnewsapp.localDb

import androidx.room.TypeConverter
import com.newcore.mvvmroomnewsapp.models.Source

class Converters {

    @TypeConverter
    fun fromSource(source: Source):String =
        source.name?:""

    @TypeConverter
    fun toSource(name:String): Source =
        Source(name,name)

}