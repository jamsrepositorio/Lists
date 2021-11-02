package com.example.list.presentation.adapters.song

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.list.R
import com.example.list.domain.Song
import com.example.list.presentation.main.MainActivity

class SongAdapter(
    private val context: Context,
    private val songs: MutableList<Song>,
    private val listener: SongInteractor
    ) : RecyclerView.Adapter<SongViewHolder>() {


    //se crea por posicion | ES PARA INFLAR LA VISTA
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SongViewHolder {
        return SongViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_song, parent, false)
        )
    }

    //se crea por posicion y se declara todos los atributos con holder...
    override fun onBindViewHolder(holder: SongViewHolder, position: Int) {
        val song = songs[position]
        holder.tvName.text = song.name
        holder.tvDuration.text = song.time.toString()
        holder.tvArtist.text = song.artist

        Glide.with(context).load(song.image).into(holder.imSong) //instanciando la imagen

        //que cada objeto es clickeable
        holder.itemView.setOnClickListener {
            listener.goToDetail(song)
        }


        //especificamos que accederemos a cada item del objeto
        holder.itemView.setOnLongClickListener{
            listener.goToDelete(position)
            true
        }
    }

    //Cuantos items quieres mostrar en la lista? | (se llama una sola vez
    override fun getItemCount(): Int = songs.size
}