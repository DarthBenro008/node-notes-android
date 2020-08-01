package com.benrostudios.node_notes.data.model

import com.google.gson.annotations.SerializedName

data class Encrypted (

	@SerializedName("title") val title : String,
	@SerializedName("body") val body : String
)