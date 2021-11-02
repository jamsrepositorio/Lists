package com.example.list.presentation.adapters.song

import com.example.list.domain.Song

interface SongInteractor {

    fun goToDetail(song: Song)
    fun goToDelete(position:Int)
}