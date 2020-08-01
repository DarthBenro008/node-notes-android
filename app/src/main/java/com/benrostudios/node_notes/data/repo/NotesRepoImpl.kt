package com.benrostudios.node_notes.data.repo

import androidx.lifecycle.LiveData
import com.benrostudios.node_notes.data.model.Notes
import com.benrostudios.node_notes.data.model.NotesBean

class NotesRepoImpl : NotesRepo {
    override suspend fun fetchNotes() {
        TODO("Not yet implemented")
    }

    override suspend fun postNotes(note: NotesBean) {
        TODO("Not yet implemented")
    }

    override val fetchedNotes: LiveData<Notes>
        get() = TODO("Not yet implemented")
    override val postNotesStatus: LiveData<Boolean>
        get() = TODO("Not yet implemented")
}