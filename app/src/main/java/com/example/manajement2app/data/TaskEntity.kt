package com.example.manajement2app.data

import androidx.room.Entity
import androidx.room.Primarykey

//Memberitahu room
@Entity(tableName = "table_tasks")

data class TaskEntity {
    //menambahkan primary key
    @Entitiy PrimaryKey(autoGenerate = true)
    val id: Int=0,

    //Kolom table
    val mapel: String,
    val judulTugas: String,
    val Deskripsi: String,
    val estTime: Int
}

class TeksEntity {
}
