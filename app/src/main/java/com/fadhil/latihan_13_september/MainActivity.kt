package com.fadhil.latihan_13_september

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var btnMi : Button
    private lateinit var btnTk : Button
    private lateinit var btnGaleri : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        btnMi=findViewById(R.id.btnmi)
        btnTk=findViewById(R.id.btntk)
        btnGaleri=findViewById(R.id.btngaleri)


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        btnMi.setOnClickListener(){
            val intent=Intent(this,Manajemen_informatika::class.java)
            startActivity(intent)
        }
        btnTk.setOnClickListener(){
            val intent=Intent(this,TeknikKomputer::class.java)
            startActivity(intent)
        }
        btnGaleri.setOnClickListener(){
            val intent=Intent(this,GalleryPhotoActivity::class.java)
            startActivity(intent)
        }
    }
}