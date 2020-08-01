package com.benrostudios.node_notes.data.repo

import androidx.lifecycle.LiveData

interface AuthRepo {
    suspend fun userLogin(username: String , password: String)
    suspend fun userRegistration(username: String , password: String)
    val authStatus : LiveData<Boolean>
}