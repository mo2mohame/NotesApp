package com.example.notesapp.data.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity(tableName = "notes")
data class Note(
    @PrimaryKey (autoGenerate = true ) val id: Long,
    @ColumnInfo(name = "title") val title: String,
    @ColumnInfo(name = "note") val note: String): Serializable
