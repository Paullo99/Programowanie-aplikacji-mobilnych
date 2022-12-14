package com.example.mountaineer.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "mountain_expedition")
data class MountainExpedition(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    @ColumnInfo(name = "mountain_name") val mountainName: String? = "",
    @ColumnInfo(name = "mountain_range_id") val mountainRangeId: Int = 0,
    @ColumnInfo(name = "mountain_height") val mountainHeight: Int = 0,
    @ColumnInfo(name = "conquer_date") val conquerDate: String? = null,
    @ColumnInfo(name = "latitude") val latitude: Double? = null,
    @ColumnInfo(name = "longitude") val longitude: Double? = null,
    @ColumnInfo(name = "photo_file_name") val photoFileName: String = ""
) {
    override fun toString(): String {
        return "MountainExpedition(id=$id, mountainName=$mountainName, conquerDate=$conquerDate)"
    }
}

