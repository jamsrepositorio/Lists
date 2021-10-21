package com.example.list.presentation.adapters.song

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.list.R

class SongViewHolder (view: View): RecyclerView.ViewHolder(view){
    //Aqui irian los componentes que se van a mostrar en cada elemento
    val tvName = view.findViewById<TextView>(R.id.tvName)
    val tvDuration = view.findViewById<TextView>(R.id.tvDuration)
    val tvArtist = view.findViewById<TextView>(R.id.tvArtist)
    val imSong = view.findViewById<ImageView>(R.id.imSong)
}