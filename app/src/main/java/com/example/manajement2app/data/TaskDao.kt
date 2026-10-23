package com.example.manajement2app.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import androidx.room.Delete
import kotlinx.coroutines.flow.Flow

@Dao
interface TaskDao {

    // Menyimpan tugas baru
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertTask(task: TaskEntity)

    // Menampilkan semua data tugas
    @Query("SELECT * FROM TaskEntity ORDER BY id DESC")
    fun getAllTask(): Flow<List<TaskEntity>>

    // Memperbarui tugas
    @Update
    suspend fun updateTask(task: TaskEntity)

    // Menghapus tugas
    @Delete
    suspend fun deleteTask(task: TaskEntity)
}
