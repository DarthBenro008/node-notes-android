package com.benrostudios.node_notes.data.model

import com.google.gson.annotations.SerializedName

data class NotesBean (

	@SerializedName("encrypted") val encrypted : Encrypted,
	@SerializedName("title") val title : String,
	@SerializedName("body") val body : String,
	@SerializedName("id") val id : Int,
	@SerializedName("createdAt") val createdAt : String,
	@SerializedName("updatedAt") val updatedAt : String,
	@SerializedName("userId") val userId : Int
)