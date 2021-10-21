package com.example.list.presentation.adapters.song

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.list.R
import com.example.list.domain.Song

class SongAdapter(private val context: Context, private val songs: ArrayList<Song>) : RecyclerView.Adapter<SongViewHolder>() {
    //se crea por posicion
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SongViewHolder {
        return SongViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_song, parent, false))
    }
    //se crea por posicion
    override fun onBindViewHolder(holder: SongViewHolder, position: Int) {
    val song = songs[position]
        holder.tvName.text = song.name
        holder.tvDuration.text = song.time.toString()
        holder.tvArtist.text = song.artist

        Glide.with(context).load(song.image).into(holder.imSong)

    }
    //Cuantos items quieres mostrar en la lista
    override fun getItemCount(): Int = songs.size
}