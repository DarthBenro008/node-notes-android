package com.benrostudios.node_notes.data.network.service

import com.benrostudios.node_notes.data.model.User
import com.benrostudios.node_notes.data.network.response.LoginResponse
import com.benrostudios.node_notes.data.network.response.RegistrationResponse
import com.benrostudios.node_notes.utils.Constants.BASE_URL
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.Body
import retrofit2.http.POST

interface AuthService {

    @POST("/app/sites")
    fun userLogin(@Body body: User?): Response<LoginResponse>

    @POST("/app/sites")
    fun userRegistration(@Body body: User?): Response<RegistrationResponse>

    companion object {
        operator fun invoke(): AuthService {
            return Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(AuthService::class.java)
        }
    }
}