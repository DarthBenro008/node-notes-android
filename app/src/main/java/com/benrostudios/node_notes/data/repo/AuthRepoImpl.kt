package com.benrostudios.node_notes.data.repo

import androidx.lifecycle.LiveData

class AuthRepoImpl : AuthRepo {
    override suspend fun userLogin(username: String, password: String) {
        TODO("Not yet implemented")
    }

    override suspend fun userRegistration(username: String, password: String) {
        TODO("Not yet implemented")
    }

    override val authStatus: LiveData<Boolean>
        get() = TODO("Not yet implemented")
}