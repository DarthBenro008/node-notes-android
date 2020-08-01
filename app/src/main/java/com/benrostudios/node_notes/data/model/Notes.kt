package com.benrostudios.node_notes.data.model

import com.google.gson.annotations.SerializedName

data class Notes (
	@SerializedName("notes") val notes : List<Notes>
)