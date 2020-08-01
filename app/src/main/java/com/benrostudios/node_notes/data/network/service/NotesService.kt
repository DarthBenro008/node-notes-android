package com.benrostudios.node_notes.data.network.service

import com.benrostudios.node_notes.data.model.Notes
import com.benrostudios.node_notes.data.model.NotesBean
import com.benrostudios.node_notes.utils.Constants.BASE_URL
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.*


interface NotesService {

    @POST("/app/sites")
    fun postNotes(@Query("user") userId: Int, @Body body: NotesBean?)

    @GET("/app/sites")
    fun fetchNotes(@Query("user") userId: Int): Response<Notes>

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