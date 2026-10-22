package com.example.manajement2app

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Toast
import com.example.manajement2app.databinding.ActivityAddTaskBinding


class AddTaskActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAddTaskBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityAddTaskBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //mengambil data dari form saat tombol simpan di klik
        binding.tombolSave.setOnClickListener {
            val mapel = binding.editMapel.text.toString().trim()
            val judulTugas = binding.editJudulTugas.text.toString().trim()
            val deskripsi = binding.editDeskripsi.text.toString().trim()

            if (mapel.isEmpty() || judulTugas.isEmpty()) {
                Toast.makeText(
                    this, "Mata Pealajaraan dan Judul wajib di isi",
                    Toast.LENGTH_SHORT
                ).show()

            } else {
                Toast.makeText(
                    this, "Tugas '$judulTugas' berhasil di simpan",
                    Toast.LENGTH_SHORT
                ).show()

            }
        }
    }
}