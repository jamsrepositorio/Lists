package com.example.list.presentation.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.bumptech.glide.Glide
import com.example.list.R
import com.example.list.domain.Song

class DetailActivity : AppCompatActivity() {

    private lateinit var tvName : TextView
    private lateinit var imgSong : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

       /* val element = intent.getStringExtra("value")
        Toast.makeText(this,element, Toast.LENGTH_SHORT).show()*/

        tvName = findViewById(R.id.tvName)
        imgSong = findViewById(R.id.imSong)

        val song = intent.getSerializableExtra("song") as Song
        tvName.text = song.name

        //libreria de procesamiento de imagen
        Glide.with(this).load(song.image).into(imgSong)
    }

    //funcion para regresar
    override fun onBackPressed() {
        super.onBackPressed()
        finish() //para que no se quede guardado nada en memoria cada que entremos a otro detalle
    }
}