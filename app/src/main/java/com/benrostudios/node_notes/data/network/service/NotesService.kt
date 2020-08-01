package com.benrostudios.node_notes.data.network.service

import com.benrostudios.node_notes.utils.Constants.BASE_URL
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

interface NotesService {



    companion object {
        operator fun invoke(): NotesService {
            return Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(NotesService::class.java)
        }
    }
}