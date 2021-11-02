package com.example.list.presentation.main

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.list.R
import com.example.list.data.song.DummySongs
import com.example.list.domain.Song
import com.example.list.presentation.adapters.song.SongAdapter
import com.example.list.presentation.adapters.song.SongInteractor
import com.example.list.presentation.detail.DetailActivity

class MainActivity : AppCompatActivity(), SongInteractor {

    lateinit var myList: ListView //enseguida se borra.

    lateinit var rvSongs : RecyclerView
    lateinit var adapter: SongAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvSongs = findViewById(R.id.rvSongs)

         //val song = Song ("Donda song", "1000", "Kennye West")

        /*myList = findViewById(R.id.myList)
        val data = arrayListOf("Primero","Segundo","Tercero","Cuarto")
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1)
        myList = findViewById(R.id.myList)

        myList.setOnItemClickListener { adapterView, view, position, id ->
            val element = adapter.getItem(position) //elemento por componente clickeado
            Toast.makeText(this,element, Toast.LENGTH_SHORT).show()
            val intent = Intent (this, DetailAcitivity::class.java)
            intent.putExtra("value", element)
            startActivity(intent).
        } */

        rvSongs = findViewById(R.id.rvSongs)

        adapter = SongAdapter(this,DummySongs.getSongs(this),this)
        rvSongs.setHasFixedSize(true)
        rvSongs.layoutManager = LinearLayoutManager(this) // es el controlador para poner las listas de manera vertical u horizontal
        rvSongs.adapter = adapter

    }

    override fun goToDetail(song: Song) {
        val intent = Intent (this, DetailActivity::class.java)
        intent.putExtra("song",song)
        startActivity(intent)
    }

    override fun goToDelete(position: Int) {
      adapter.notifyItemRemoved(position)
    }


}