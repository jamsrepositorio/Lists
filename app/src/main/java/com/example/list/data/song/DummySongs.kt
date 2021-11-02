package com.example.list.data.song

import android.content.Context
import com.example.list.domain.Song

object DummySongs {


    //regresar una lista sin que la estemos declarando en el MainActivity

    fun getSongs(context: Context): MutableList<Song> {
        return mutableListOf(
            Song("19-2000",4100,"Gorillaz","https://sonar.es/system/attached_images/19685/medium/gorillaz-sonar-bcn-2018.jpg?1517486863"),
            Song("America",3500,"Rammstein",""),
            Song("Chocolate",2600,"Limp Bizkit",""),
            Song("Waterfall",5500,"Megadeth",""),
            Song("Cementery Gates",4500,"Pantera","")
        )
    }
}