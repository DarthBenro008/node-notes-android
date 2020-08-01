package com.benrostudios.node_notes.data.network.response

data class LoginResponse(
    val status: String,
    val error: String,
    val userId: String
)