package com.benrostudios.node_notes.data.repo

import androidx.lifecycle.LiveData
import com.benrostudios.node_notes.data.model.Notes
import com.benrostudios.node_notes.data.model.NotesBean

interface NotesRepo {
    suspend fun fetchNotes()
    suspend fun postNotes(note: NotesBean)
    val fetchedNotes : LiveData<Notes>
    val postNotesStatus: LiveData<Boolean>
}