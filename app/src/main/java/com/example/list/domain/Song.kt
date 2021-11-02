package com.example.list.domain

import java.io.Serializable

//Objeto
data class Song(
    val name: String,
    val time: Long,
    val artist: String,
    val image: String
) :Serializable // es una extensión ...
