package com.benrostudios.node_notes.di.modules

import com.benrostudios.node_notes.data.network.service.AuthService
import com.benrostudios.node_notes.data.network.service.NotesService
import org.koin.dsl.module

val networkModules = module {
    single { AuthService() }
    single { NotesService() }
}