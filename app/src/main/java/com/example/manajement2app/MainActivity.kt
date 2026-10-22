package com.example.manajement2app

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Toast
import com.example.manajement2app.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    //deklarasikan binding untuk main dashboard kita

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //inisialisasi binding
        binding  = ActivityMainBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)

        //mengubah teks agar menjadi dinamis
        binding.tvNamaSiswa.text = "zahsiv (XII RPL 5)"
        binding.tvJumlahTugas.text = "4"
        binding.tvRataNilai.text = "90.0"

        //aksi ketika klik tombol navigasi ke form tugas
        binding.TombolForm.setOnClickListener{
            val intent = Intent(this, AddTaskActivity::class.java)
            startActivity(intent)
       }

        ViewCompat.setOnApplyWindowInsetsListener(binding.root) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}